public class Championship {
    public static void main(String[] args) {

        int gryffindor = 450;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;

        //if gryffindor wins by a margin of 300 points:
        if (margin > 300) {
            //print: Gryffindor takes the house cup!
            System.out.println("Gryffindor takes the house cup!");
             
        } else if (gryffindor > ravenclaw) { //if gryffindor wins by a margin of any points:
            //print: In second place, Gryffindor!
            System.out.println("In second place, Gryffindor!");

        } else if (Math.abs(margin) <= 100){ //if gryffindor loses by a margin of 100 points, they are third:
            //print: In third place, Gryffindor!
            System.out.println("In third place, Gryffindor!");

        } else { //else:
            //print: In fourth place, Gryffindor! 
            System.out.println("In fourth place, Gryffindor!");
        }
        


        

        
    }
}