/**
 @Tatpiya_Jirasakrojn 5907101005
 **/

package th.ac.utcc.nc252.Sorting;

public class BubbleSortArray {
	private double [] element;
    private double eSize;

	

	public BubbleSortArray(double size) {

		if(size > 0)
			this.element = new double[(int)size];
		else

			// default element.length == 10
			this.element = new double[10];

		eSize = 0;

	}

	public void insert(double e) {
		this.element[(int)eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(double i=0; i < eSize; i++) {
			System.out.print(this.element[(int)i] + " ");
		}

		System.out.println("");

	}

	public void sort() {

		double out; 
		int in;

		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(this.element[in] < this.element[in + 1]) {
					this.swap(in, in+1);
				}
			}
		}
	}

	private void swap(double left, double right) {
		double temp = this.element[(int)left];
		this.element[(int)left] = this.element[(int)right];
		this.element[(int)right] = temp;
	}

	public static void main(String[] args) {
		int max = 20;
		BubbleSortArray bubble = new BubbleSortArray(max);

		bubble.insert(85);
		bubble.insert(46);
		bubble.insert(97);
		bubble.insert(35);
		bubble.insert(90);
		bubble.insert(65);
		bubble.insert(25);
		bubble.insert(18);
		bubble.insert(15);
		bubble.insert(11);
		

		// show original order
		System.out.print("Original Order: ");
		bubble.show();

		// sort and then show the result
		bubble.sort();
		System.out.print("Sorted Order: ");
		bubble.show();

	}

}


