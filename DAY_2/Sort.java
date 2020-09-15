
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,4,3,2,1};
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
