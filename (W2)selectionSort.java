/**
@Tatpiya_Jirasakrojn 5907101005
 * */
package th.ac.utcc.cpe.sirawit;

public class selectionSort { 
		private int [] element ;
		private int eSize ;
		public selectionSort(int size){
			if(size < 0)
				this.element = new int [size];
		else
			this.element = new int [10];
			eSize = 0;
		}

		public void insert(int e){
			this.element[eSize] = e ;
				eSize++ ;
		}

		public void show(){
			for(int i =0 ; i < eSize ; i++){
				System.out.print(this.element[i]+" // ");
			}
				System.out.println(" ");
		}

		public void selectionSort(){
			int out, in, min ;
		for(out = 0 ; out<eSize-1; out++){
			min = out ;
			for(in = out+1; in< eSize; in++){
				if(this.element[in]< this.element[min]){
					min=in;
				}
				this.swap(out,min);
			}
		}
	}
		
		private void swap(int left , int right){
			int temp = this.element[left];
			this.element[left] = this.element[right] ;
			this.element[right] = temp ;

	}

		public static void main (String[] args){
			int max = 20 ;
			selectionSort Algor = new selectionSort(max);
			Algor.insert(50);
			Algor.insert(45);
			Algor.insert(99);
			Algor.insert(15);
			Algor.insert(90);
			Algor.insert(72);
			Algor.insert(20);
			Algor.insert(10);
		System.out.print("Original Order selection : ");
		Algor.show();
			Algor.selectionSort();
		System.out.print("Sorted Order: ");
		Algor.show();
		}
	}

