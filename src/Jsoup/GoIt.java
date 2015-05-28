package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.Date;

/**
 * Created by Suheng on 5/28/15.
 */
public class GoIt {
    public static void main(String[] args) throws IOException, InterruptedException {
        String urlString = "http://localhost:8080/testWeb";
//        if(isSameContent("data", "rawData")){
//            System.out.println("sd");
//        }
        while (true) {
            System.out.println("Sleep 5s.....");
            Thread.sleep(5000);
            goItCore(urlString);
        }
    }

    public static void goItCore(String urlString) throws IOException {
        StringBuffer sb = getURLContent(urlString, "data");
        if (isSameContent("data", "rawData")) {
            System.out.println("内容没有发生改变");
        } else {
            Date date = new Date();
            System.out.println("内容发生变化:" + date.getTime());

            //将改变的数据和对应的时间写入到history文件中做记录
            FileWriter fileWriter = new FileWriter("history", true);
            fileWriter.write("\nTime:" + date.getTime() + "\nContent:" + sb.toString() + "\n-------");
            fileWriter.close();
            //将rawData的内容复制到data中作为下一次的比较
            copyFile(new File("data"), new File("rawData"));
        }
    }

    //根据制定的页面获取数据，存入到data文件中
    public static StringBuffer getURLContent(String urlRaw, String fileName) throws IOException {
        String url = urlRaw;
        StringBuffer sbResult = new StringBuffer();
        sbResult.append(String.format("Fetching %s...", url));


        Document doc = Jsoup.connect(url).get();

        Elements links = doc.select("a[href]");

        Elements media = doc.select("[src]");

        Elements imports = doc.select("link[href]");

        sbResult.append(String.format("\nMedia:(%d)", media.size()));

        for (Element src : media) {
            if (src.tagName().equals("img")) {
                sbResult.append(String.format("* %s:<%s>%sx%s(%s)", src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"), trim(src.attr("alt"), 20)));
            } else {
                sbResult.append(String.format("* %s:<%s>", src.tagName(), src.attr("abs:src")));
            }
        }


        sbResult.append(String.format("\nImports:  (%d)", imports.size()));

        for (Element link : imports) {
            sbResult.append(String.format("* %s<%s>(%s)", link.tagName(), link.attr("abs:href"), link.attr("rel")));
        }


        sbResult.append(String.format("\nLinks:(%d)", links.size()));
        for (Element link : links) {
            sbResult.append(String.format("* a:<%s>(%s)", link.attr("abs:href"), trim(link.text(), 35)));
        }

        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(sbResult.toString());
        fileWriter.close();

        return sbResult;
    }

    //getURLContent函数的辅助函数
    private static String trim(String s, int width) {
        if (s.length() > width) {
            return s.substring(0, width - 1) + ".";
        } else {
            return s;
        }
    }


    //检查两个文件是否相同
    public static boolean isSameContent(String fileName1, String fileName2) throws IOException {
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(
                new FileInputStream(file1)));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(
                new FileInputStream(file2)));
        String content = br1.readLine();
        boolean same = false;
        while (content != null) {
            String content2 = br2.readLine();
            boolean b = (content == null);
            same = b ? content2 == null : content.equals(content2);
            content = br1.readLine();
        }
        br1.close();
        br2.close();
        return same;
    }


    public static void copyFile(File file1, File file2) {
        if (!file1.exists()) {
            System.out.println("源文件不存在!");
        }
        InputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file1);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (fileInputStream != null && fileOutputStream != null) {
            int temp = 0;
            try {
                /**
                 * 边读边写
                 */
                while ((temp = fileInputStream.read()) != -1) {
                    fileOutputStream.write(temp);
                }
                System.out.println("复制完成");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("复制失败");
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
