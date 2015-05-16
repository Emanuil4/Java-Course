
public class Inheritance {

	public static void main(String[] args) {
		Car[] array = new Car [10];
		array[0] = new Automobile(9000, 7);
		array[1] = new Automobile(5000, 8);
		array[2] = new Automobile(10000, 9);
		array[3] = new Automobile(1000, 10);
		array[4] = new Automobile(4000, 12);
		array[5] = new SUV(17000, true);
		array[6] = new SUV(14000, true);
		array[7] = new SUV(13000, true);
		array[8] = new SUV(15000, false);
		array[9] = new SUV(11000, true);
		for(int i = 0; i < 5; i++){
			for (int k = 0; k < array.length - 5; k++)
            {
                if (array[k].price > array[k + 1].price) 
                {
                    int f= array[k].price;
                    array[k].price = array[k + 1].price;
                    array[k + 1].price = f;
                }
            }
		}
		for(int i = 5; i < 10; i++){
			for (int k = 0; k < array.length - 1; k++)
            {
                if (array[k].price > array[k + 1].price) 
                {
                    int f= array[k].price;
                    array[k].price = array[k + 1].price;
                    array[k + 1].price = f;
                }
            }
		}
		for (int i = 0; i < 5; i++){
			array[i].sayPrice();
			array[i].sayFuel();
		}
		for(int j = 5; j < 10; j++){
			array[j].sayPrice();
			array[j].sayAllRoad();
		}
	}
}
