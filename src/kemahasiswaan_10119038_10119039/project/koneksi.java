/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemahasiswaan_10119038_10119039.project;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
/**
 * @authors
 *      Rachman Aldiansyah - 10119038
 *      Diva Sabila Ramadhan - 10119039
 */
public class koneksi 
{
    public Properties mypanel, mylanguage;
    private String strNamePanel;
    public koneksi()
    {
        
    }
    public String SettingPanel(String nmPanel)
    { 
        try
        {
            mypanel = new Properties();
            mypanel.load(new FileInputStream
            ("lib/database.ini"));
            strNamePanel = mypanel.getProperty(nmPanel);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, 
                    e.getMessage(),"Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return strNamePanel;
    }
}
