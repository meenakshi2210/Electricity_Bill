import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;
class electricity
{
    //long prev,curr;
    long lt,lg;
    String name,address;
    //long units;
    String todayAsString,dt,dt1;
    double u1,tamt1,amt1,u2,amt2,tamt2,u3,amt3,tamt3,gamt,l_gamt,late;
    void input()
    {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the consumer name");
        name = in.next();
        System.out.println("Enter the consumer's address");
        address = in.next();
        /**System.out.println("Enter the previous readings and current readings");
        prev = in.nextLong();
        curr = in.nextLong();
        units = curr - prev; */
    }
    
    void head(long p,long c,long ut)
    {
        System.out.println("\t\tPUNJAB STATE POWER\n\t\tCORPORATION LIMITED\n\t\tREGD OFF PSEB HEAD OFF\n\t\tTHE MALL PATIALA-14700\n\t\tWEBSITE:www.pspcl.in\n\t\tCOMPLAINT CENTER NO: 1912\n\t\tEMAIL: 1912@pspcl.in ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\t\tELECTRICITY BILL");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\tSUB DIV NAME AND CODE\n\t\tNANGAL SUB-DIVISION(4313)\n\t\tDIV : ANANDPUR SAHIB\n\n\t\tCIRCLE : RUPNAGAR\n\t\tACCOUNT NUMBER: 3000305034\n\t\tCONSUMER NAME & ADDRESS");;
        System.out.println("\t\t"+name+"\n\t\t"+address);
        System.out.println("\t\tCONSUMER GST N0. :0\n\t\tBILL NO :500174665707\n\t\tDATE :"+todayAsString+"\n\t\tBILL GRP:1  BILL CYC:06");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\tDUE DATE\n\t\tBY CASH/ONLINE   :"+dt+"\n\t\tBY CHEQUE/DRAFT :"+dt1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\tTRF TYPE: DS(GEN) SL(KW):1.94 \n\t\tMTR TY:1 ph ELECTRONIC MTR\n\t\tMETER NO :  MAKE:  DIGIT:\n\t\t4314098\t\t06\n\n");
        System.out.println("\t\tDATE\t\tREADINGS\n\t\tNEW:\t\t"+c+"\n\t\tOLD:\t\t"+p+"\n\t\tCURR CONS:\t"+ut+"\n\t\tOLD MTR CONS:\t0\n\t\tTOTAL CONS:\t"+ut+"\n\t\tMDI(KW):\t00\n\t\tBILL PERIOD:\t62\n\t\tMTR STS:\t 0\n\t\tBILL STATUS:\tOK");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\t(A) FIXED CHARGES\n\t\t(a)80% LOAD:\t1.552\n\t\t(b)RATE:\t35.000\n\t\t(c)BILL PERIOD:\t62\n\t\tFC = a*b*c*12/365 :111\n\t\t(B)ENERGY CHARGES\n\t\tSLAB:\t\tUNIT:\tRATE:\tTOATL\n\t\t000-100\t\t"+u1+"\t3.49\t"+amt1+"\n\t\t101-300\t\t"+u2+"\t5.84\t"+amt2+"\n\t\t>300\t\t"+(ut-300.0)+"\t6.23\t"+amt3+"\n\t\tTOT. EC:\t"+ut+"\t\t"+tamt3);
        System.out.println("\t\t(C)\t\tUNIT\t\tRATE\tAMT\n\t\tFCA\t\t0\t\t0.0\t0\n\t\tADL.SUR\t\t0\t\t0.0\t0.0\n\t\t(D)RENTS\n\t\tMETER\t\t\t:17\n\t\tMCB\t\t\t:8\n\t\tOTHER\t\t\t:0\n\t\tCGST\t\t\t:0.0\n\t\tSGST\t\t\t:0.0\n\t\tTOTAL RENTS\t\t:25.0");
        System.out.println("\t\t(E)TAXES\n\t\tED(13%)\t\t\t:0\n\t\tIDF(5%)\t\t\t:0\n\t\tM.C.TAX(2%)\t\t:0\n\t\tCOW CESS(0.0)\t\t:0\n\t\tTOTAL TAX\t\t:0\n\t\t(F)PREV ADJUSTMENT DETAIL\n\t\tFC\t\t\t:0\n\t\tEC\t\t\t:0\n\t\tRENT\t\t\t:0\n\t\tTAX\t\t\t:0\n\t\tTOTAL ADJ AMT\t\t:0.0\n\t\t(G)PREVIOUS APPEARS\n\t\tAPPEARS\t\t\t:-5\n\t\tSURCHARGE\t\t:0\n\t\tINTEREST\t\t:0\n\t\tTOTAL AMT\t\t:-5");
        System.out.println("\t\t(H)SUNDRY CHARGES\n\t\tFC\t\t\t:0\n\t\tEC \t\t\t:0\n\t\tRENT\t\t\t:0\n\t\tTAX\t\t\t:0\n\t\tTOTAL AMT\t\t:0\n\t\t(I)SUNDRY ALLOWANCES\n\t\tEC \t\t\t:0\n\t\tRENT\t\t\t:0\n\t\tTAX\t\t\t:0\n\t\tTOTAL AMT\t\t:0\n\t\t(J)SUBSIDY\n\t\tUNIT\t\t\t:"+ut+"\n\t\tGOP-SUBSIDY\t\t:"+(ut*5.3)+"\n\t\tTOT(A+B+C+D+E+G+H-F-I-J)");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\n\t\tGROSS AMOUNT\t\t:"+gamt+"\n\t\t2% LATE PYMT SUR:"+late+"\n\t\tPAY AFT DUE DT:"+l_gamt);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\n\t\tMESSAGE\n\n\t\tLATTITUDE\t:31.3799501\n\t\tLONGITUDE\t:76.3806218\n\t\tMETER READER ID: 5541792\n\t\tMOBIL_NO :6985476912\n\t\tBILL MADE BY : MANNUAL");
        System.out.println("----------------------------------------------------------------------");
    }
    void calculation(long units)
    {
            if(units < 100.0)
            {
            u1 = units;
            amt1 = units*3.49;
            tamt1 = units*3.49;
            }
            else
            {
                u1 = 100;
                amt1 = 100*3.49;
                tamt1 = amt1;
            }
        
            if(units > 100.0 && (units - 100)<200)
            {
            u2 = units - 100.0;
            amt2 = u2*5.84;
            tamt2 = 100*3.49 + (units-100.0)*5.84;
            }
            else
            {
                u2 =200;
                amt2 = u2*5.48;
                tamt2 = tamt1 + amt2; 
            }
            if(units > 300)
            {
            u3 =  units -300.0;
            amt3 = u3*6.23;
            tamt3 = tamt2 + amt3;
            }
            else
            {
                u3 = 0;
                amt3 = 0; 
                tamt3 = tamt2;
            }
            double temp = 111+tamt3+0+25+0+(-5)+0-0-0-(units*5.3);
            if(temp < 0)
            {
                gamt = 0;
                late = 0;
                l_gamt = 0;
            }
            else
            {
                gamt = temp;
                late = ((2*gamt)/100);
                l_gamt = gamt+((2*gamt)/100);
            }
    }

    void check()
    {
        /**SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dt = formatter.format(date) ;  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.DATE, 15);  // number of days to add
        dt= sdf.format(c.getTime());// dt is now the new date
        String dt1 = dt.toString();
        c1.setTime(sdf.parse(dt1));
        c1.add(Calendar.DATE, 121);  // number of days to add
        dt1= sdf.format(c1.getTime());*/
        String pattern = "dd/MM/yyyy";

        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date according to the chosen pattern
        SimpleDateFormat df = new SimpleDateFormat(pattern);

        // Get the today date using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        todayAsString = df.format(today);
        //System.out.println(todayAsString);
        Calendar c = Calendar.getInstance();
        //c.setTime(df.parse(todayAsString));
        c.add(Calendar.DATE, 15);
        dt= df.format(c.getTime()); 
        //System.out.println(dt);
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DATE, 12);
        dt1= df.format(c1.getTime()); 
    }

    public static void main()
    {
        Scanner in = new Scanner(System.in);

        
        
        electricity obj = new electricity();
        obj.input();
        System.out.println("Enter the previous readings and current readings");
        long prev = in.nextLong();
        long curr = in.nextLong();
        long un = curr - prev;
        obj.check();
        obj.calculation(un);
        obj.head(prev,curr,un);

    }
}