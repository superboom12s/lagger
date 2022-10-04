import javax.swing.*;

public class lagger {
    

        public static void main(String[] args) {
            JFrame jFrame = new JFrame();

            String continuar = JOptionPane.showInputDialog(jFrame, "Estas seguro de que quieres continuar?\npuede que tu equipo se sobrecaliente u otras cosas\n\n[S/N]");



            if (continuar.equals("S")||continuar.equals("s")){

                int loopVal = 0;

                String actualLag = "";

                while(true) {

                    String[] lagstring = new String[99999999];

                    actualLag = String.valueOf(Math.sqrt(Math.sqrt(Math.floor(Math.random() * 1000000000))));

                    System.out.println(actualLag);

                    try{
                        lagstring[loopVal] = actualLag;
                    }catch(Exception e){
                        loopVal = 0;
                    }


                    loopVal++;



                }


            }else{
                System.out.println("Operacion cancelada.");
                JOptionPane.showMessageDialog(jFrame, "Operacion cancelada.");
            }




        }
}
