import javax.swing.JFileChooser;

public class Client {
	
	private static AbstractDirectory recurse(java.io.File parentFile, int level) {
		if(parentFile.isDirectory()) {
			Directory dir = new Directory(parentFile.getName(), level);
			java.io.File[] files = parentFile.listFiles();
			for(java.io.File file : files) {
				dir.add(recurse(file, level+1));
			}
			return dir;
		}
		else {
			return new File(level, parentFile.getName(), parentFile.length());
		}
	}
	
	
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
	    chooser.setCurrentDirectory(new java.io.File("."));
	    chooser.setDialogTitle("Select Directory");
	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    chooser.setAcceptAllFileFilterUsed(false);
	    
	    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    	java.io.File selectedDirectory = chooser.getSelectedFile();
	    	AbstractDirectory dir = recurse(selectedDirectory, 0);
	    	System.out.println(dir.getSize());
	    }   
	}

}
