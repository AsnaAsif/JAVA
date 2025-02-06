package abstractmethod;

public class VideoClass extends GoogleClass {
	public void search()
	{
		System.out.println("video");
	}
	public static void main(String[] args) {
		VideoClass obj=new VideoClass();
		obj.search();
		ImageClass obj1=new ImageClass();
		obj1.search();
	}

}
