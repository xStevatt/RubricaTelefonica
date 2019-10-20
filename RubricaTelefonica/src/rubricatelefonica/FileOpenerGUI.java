package rubricatelefonica;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileOpenerGUI extends JPanel
{   
    private File XMLFile; 
    
    public FileOpenerGUI()
    {   
        JFileChooser filechooser = new JFileChooser(); 
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.xml", "xml");
        filechooser.setFileFilter(filter);
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        filechooser.setMultiSelectionEnabled(false);
        filechooser.setFileHidingEnabled(true);
        
        int n = filechooser.showOpenDialog(FileOpenerGUI.this);
        this.XMLFile = filechooser.getSelectedFile();
    }
    
    public String getTextFile()
    {
        try
        {
            if(!XMLFile.getAbsolutePath().equalsIgnoreCase(null))
            {
                return XMLFile.getAbsolutePath();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Nessun file selezionato", "Attenzione", JOptionPane.WARNING_MESSAGE);
                return "rubrica.xml"; 
            }
        }
        catch(Exception e)
        {
            
        }
        
        return "rubrica.xml"; // Ritorna il file di default
    }
}
