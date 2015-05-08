package DesignPattern.MVCPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class StudentController {
    private Student model;//MVC's Model
    private StudentView view;//MVC's View

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRolNo());
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRolNo(rollNo);
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentRolNo() {
        return model.getRolNo();
    }
}
