package main;

import model.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Correy on 4/7/2014.
 */
public class runner {

    public static void main(String[] args){

        int numNodes = 4;
        List<Node> nodes = new LinkedList<Node>();

        int radius = 1;
        double theta = 360/(numNodes-1);



        for(int i = 0; i < numNodes; i ++){
            Node node = new Node();

            if (i == 0){
                node.setX(0);
                node.setY(0);
            }
            else {
                double _theta = theta*(i-1);
                print(Math.toRadians(_theta));

            }

            nodes.add(node);
        }

    }

    public static void print(double theta){
        double x = 1;
        double y = 1;
        if( ((Math.toDegrees(theta) / 90) % 2) == 1)
        {
            x = x*0;
            y = y*Math.sin(theta);
        }
        else if( ((Math.toDegrees(theta) / 90) % 2) == 0)
        {
            x = x*Math.cos(theta);
            y = y*0;
        }
        else
        {
            x = x*Math.cos(theta);
            y = y*Math.sin(theta);
        }
        System.out.println("cos" + Math.round(Math.toDegrees(theta)) + ": " + x);
        System.out.println("sin" + Math.round(Math.toDegrees(theta)) + ": " + y);

    }

}
