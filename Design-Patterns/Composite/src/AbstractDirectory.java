
public abstract class AbstractDirectory {
	private String name;
	private int level;
	
	public AbstractDirectory(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	
	public int getLevel(){
		return this.level;
	}

	public String getName(){
		return this.name;
	}
	
	public abstract long getSize();
	
}
