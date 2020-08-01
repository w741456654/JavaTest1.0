package comn.neuedu.test;

public class ErFenChaZhao {

	public static void main(String[] args) {
		// 二分查找
  int[] arr ={1,2,6,9,13,55,88};

  int key =12;
  int low =0;
  int high =arr.length-1;
  int locale=-1;
  
  while(low<=high)
  {
	  
	  int mid =(low+high)/2;
	  if(key>arr[mid])
	  {
		  low=mid+1;
	  }
	  else if(key<arr[mid])
	  {
		high=mid-1;  
	  }
	  else
	  {
		  locale=mid;
		  break;
	  }
  }
  if(locale>-1)
  {
	  System.out.println("下标"+locale);
  }
  else
  {
	  System.out.println("没有");
  }
	}

}
