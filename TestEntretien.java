import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestEntretien {

	public static void main(String[] args) {

		List<Car> carLittleList = Arrays.asList(new Car(Color.Red), new Car (Color.Green));
		//Add Parameter

		//Create a car with a String instead of an enum
		var car = new Car(Color.Red);
		System.out.println("Car: " + car);

		List<Car> carList = Arrays.asList(new Car(Color.Red), new Car (Color.Green), new Car (Color.Yellow), new Car (Color.Green)
				, new Car (Color.Yellow), new Car (Color.Black), new Car (Color.Green), new Car (Color.Green)
				, new Car (Color.Yellow), new Car (Color.Red), new Car (Color.Green), new Car (Color.Green)
				, new Car (Color.Green), new Car (Color.Black), new Car (Color.Red), new Car(Color.Blue));

		//Keep only Green

		//converter in a new List of truck,
		//Blue 6 wheels
		//Black 8 wheels
		//Green 4 wheels
		//Yellow 5 wheels
		//Red 7 wheels

		//Order trucks by number of wheels

		//Fill the Map
		Map <String, List<Car>> carsByColor = new HashMap<>();

		//Clean the map, if the color is green, the list must be empty use replaceAll

		//Convert to singleton
		System.out.println(MySingleton.updateCompany(car));

		//Compare two car
		var carCompare1 = new Car(Color.Red, "Ford");
		var carCompare2 = new Car(Color.Red, "Audi");
		System.out.println(MySingleton.compareCar(carCompare1, carCompare2));
	}

	record Truck (Color color, String nbWheels, String company) {
	}

	record Car (Color color, String company) {

		public Car(Color color) {
			this(color, "");
		}

		/**
		 * Read a file from file, 
		 * File format one car by line, example
		 * line 1 Color Brand
		 * line 2 Color Brand
		 * @param fileName
		 * @return
		 */
		public static Car readCarFromFile(String fileName) {
			try {
				var file = new File(fileName);
				var scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					
				}
			} catch (Throwable e) {

			}
			return null;
		}
	}

	public enum Color {
		Green,
		Red,
		Yellow,
		Black,
		Blue;
	}

	static class MySingleton {

		public static  Car updateCompany(Car car) {
			car.company.toUpperCase();

			return car;
		}

		public static boolean compareCar(Car car1, Car car2) {
			return false;
		}
	}

}
