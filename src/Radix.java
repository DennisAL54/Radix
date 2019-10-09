import java.util.ArrayList;
public class Radix {

    public void Ordenar(int[] Lista){
        int n;
        n = Lista.length;
        int i;
        int c;
        c = 0;
        int d;
        d = 10;
        ArrayList<Integer> Lista0 = new ArrayList<>();
        ArrayList<Integer> Lista1 = new ArrayList<>();
        ArrayList<Integer> Lista2 = new ArrayList<>();
        ArrayList<Integer> Lista3 = new ArrayList<>();
        ArrayList<Integer> Lista4 = new ArrayList<>();
        ArrayList<Integer> Lista5 = new ArrayList<>();
        ArrayList<Integer> Lista6 = new ArrayList<>();
        ArrayList<Integer> Lista7 = new ArrayList<>();
        ArrayList<Integer> Lista8 = new ArrayList<>();
        ArrayList<Integer> Lista9 = new ArrayList<>();
        while(c!=n){
            for(i=c; i<= n; i++){
                if(Lista[i]%d == Lista[i]){
                    Lista[i] = Lista[c];
                    Lista[c] = Lista[i];
                    c = c+1;
                }
                else if(Lista[i]%d == 0){
                    Lista0.add(Lista[i]);

                }
                else if(Lista[i]%d == 1){
                    Lista1.add(Lista[i]);

                }
                else if(Lista[i]%d == 2){
                    Lista2.add(Lista[i]);

                }
                else if(Lista[i]%d == 3){
                    Lista3.add(Lista[i]);

                }
                else if(Lista[i]%d == 4){
                    Lista4.add(Lista[i]);

                }
                else if(Lista[i]%d == 5){
                    Lista5.add(Lista[i]);

                }
                else if(Lista[i]%d == 6){
                    Lista6.add(Lista[i]);

                }
                else if(Lista[i]%d == 7){
                    Lista7.add(Lista[i]);

                }
                else if(Lista[i]%d == 8){
                    Lista8.add(Lista[i]);

                }
                else{
                    Lista9.add(Lista[i]);

                }
            }

        }


    }
}
