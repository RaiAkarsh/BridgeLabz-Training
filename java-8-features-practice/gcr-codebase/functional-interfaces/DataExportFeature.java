interface ReportExporter{
    void exportCSV();
    void exportPDF();
    default void exportToJSON(){
        System.out.println("Export JSON");
    }
}

class SalesReport implements ReportExporter{
    public void exportCSV(){
        System.out.println("CSV");
    }
    public void exportPDF(){
        System.out.println("PDF");
    }
}

public class DataExportFeature{
    public static void main(String[] args){
        ReportExporter r=new SalesReport();
        r.exportToJSON();
    }
}
