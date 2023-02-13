package OOP5;

import Model.DivModel;
import Model.MultModel;
import Model.SubModel;
import Model.SumModel;

public class Presenter {
    View view = new View();
    Log log = new Log();

    double x;
    double y;

    public void buttonClick() {
        x = (view.getValue("a: "));
        y = (view.getValue("b: "));
        int choice = view.getChoice();

        if (choice == 1) {
            System.out.println(new SumModel().result(x, y));
            log.record(new SumModel().result(x, y));
        } else if (choice == 2) {
            System.out.println(new SubModel().result(x, y));
            log.record(new SubModel().result(x, y));
        } else if (choice == 3) {
            System.out.println(new MultModel().result(x, y));
            log.record(new MultModel().result(x, y));
        } else if (choice == 4) {
            System.out.println(new DivModel().result(x, y));
            log.record(new DivModel().result(x, y));
        } else {
            System.out.println("Несоответствующая операция!");
        }

    }
}

