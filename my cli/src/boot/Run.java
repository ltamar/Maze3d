package boot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import controller.MyController;
import model.MyModel;
import view.MyView;

public class Run {

	public static void main(String[] args) {
		MyModel model = new MyModel();
		MyView view = new MyView(new BufferedReader(new InputStreamReader(System.in)),new PrintWriter(System.out));
		MyController controller = new MyController(model , view);
		
		model.setController(controller);
		view.setController(controller);

		view.start();

	}

}