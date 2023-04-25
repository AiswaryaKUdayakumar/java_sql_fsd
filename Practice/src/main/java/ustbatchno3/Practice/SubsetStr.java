package ustbatchno3.Practice;

public class SubsetStr{
	public static void main(String[] args) {
		String str="Fun";
		String s=str.toLowerCase();
		int len=s.length();
		int temp=0;
		String[] arr=new String[len*(len+1)/2];
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				arr[temp]=s.substring(i, j+1);
				temp=temp+1;
				}}
			System.out.println("subsets are; ");
			for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
		}
		
	}
}

