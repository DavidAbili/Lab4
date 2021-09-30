/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 9/30/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
public class Television {

	
		// TODO Auto-generated method stub

		private String manufacturer;
		private int screenSize;
		private boolean powerOn;
		private int channel;
		private int volume;
		

		public Television(String brand, int size){

			manufacturer = brand;
			screenSize = size;
          volume = 20;
          channel =2;
          powerOn = false;
		}

		
		public void setChannel(int ch){
			channel = ch;
		}

		public void power() {
			if(powerOn = true) {
				powerOn = false;
			}else {
				powerOn = true;
			}
		}
		
		public void increaseVolume() {
			volume++;
		}
		
		public void decreaseVolume() {
			volume--;
		}
		
		
		public int getScreenSize() {
			return screenSize;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public int getChannel() {
			return channel;
		}
		
		public int getVolume() {
			return volume;
		}
	

}
