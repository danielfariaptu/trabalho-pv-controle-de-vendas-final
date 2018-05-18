package Model;
import Banco.Conexao;
import java.sql.Connection;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRException;

public class AbstractJasperReports {

    private static JasperReport report;
    private static JasperPrint reportFilled;
    private static JasperViewer viewer;
    private static Connection conn;
    
    public AbstractJasperReports(){
        conn = Conexao.getConexao();
    }
    
    public static void createReport(String path) {
        try{
            report = (JasperReport) JRLoader.loadObjectFromFile( path );
            reportFilled = JasperFillManager.fillReport(report, null, conn);
            
        }catch(JRException ex){
            ex.printStackTrace();
        }
        
    }

    public static void showViewer() {
        
        viewer = new JasperViewer( reportFilled );
        viewer.setVisible(true);

    }
}
