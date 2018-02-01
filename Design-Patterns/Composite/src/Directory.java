import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractDirectory {
	
	private List<AbstractDirectory> directoryList;
	
	
	public Directory(String name, int level){
		super(name, level);
		this.directoryList = new ArrayList<AbstractDirectory>();
	}
	
	
	public void add(AbstractDirectory dir){
		this.directoryList.add(dir);
	}


	@Override
	public long getSize() {
		long sumSize = 0;
		
		for(AbstractDirectory element : directoryList){
			sumSize += element.getSize();
		}
		return sumSize;
	}
	
	
	
	
	
	
	
}
