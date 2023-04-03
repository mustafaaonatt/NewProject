package QA63;

public class ReportTool extends Tool{
 // Ask about access modifier
  public void export(){
        System.out.println("RToll::export");
    }
    public static void callExport(Exportable ex){
        ex.export();
    }

    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
}
