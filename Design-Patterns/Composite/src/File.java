
public class File extends AbstractDirectory {

	private long size;
	
	public File(int level,String name, long size) {
		super(name, level);
		this.size = size;
	}
	
	public long getSize(){
		return this.size;
	}
	
	
	

}
