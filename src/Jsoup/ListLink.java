package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Suheng on 5/10/15.
 */
public class ListLink {
    public static void main(String[] args) throws IOException {
        Validate.isTrue(args.length == 1, "Usage: supply url to fetch");
        String url = args[0];//get the url from the args[0]
        print("Fetching %s...", url);

        //Connecting to the url
        Document doc = Jsoup.connect(url).get();
        //Get all the a tag from the pages
        Elements links = doc.select("a[href]");
        //Get all the media tag from pages
        Elements media = doc.select("[src]");
        //get the links
        Elements imports = doc.select("link[href]");

        print("\nMedia:(%d)", media.size());//print the size of the media from this page
        //use for loop to print all the media
        for (Element src : media) {
            if (src.tagName().equals("img")) {
                print("* %s:<%s>%sx%s(%s)", src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"), trim(src.attr("alt"), 20));
            } else {
                print("* %s:<%s>", src.tagName(), src.attr("abs:src"));
            }
        }

        //print all the import link
        print("\nImports:  (%d)", imports.size());
        //print all the link from this pages use for loop
        for (Element link : imports) {
            print("* %s<%s>(%s)", link.tagName(), link.attr("abs:href"), link.attr("rel"));
        }

        //print all the link
        print("\nLinks:(%d)", links.size());
        for (Element link : links) {
            print("* a:<%s>(%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }

    //to print the message
    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }


    private static String trim(String s, int width) {
        if (s.length() > width) {
            return s.substring(0, width - 1) + ".";
        } else {
            return s;
        }
    }
}
