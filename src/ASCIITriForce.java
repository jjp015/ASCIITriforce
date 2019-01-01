/**
 * @author: Jeremy Park
 * @email:  jjp015@ucsd.edu
 *
 */
import java.util.Scanner;

/**
 * The POWeek class program contains the main method that will run the
 * program to create a size of the spaceship dependingon the user's input,
 * attach boosters to it, count down, and launch
 */
public class ASCIITriForce {
    /**
     * Draw the user's choice of rocket 1
     * @param spSize - space to form triangle
     * @param shSize - number of shades to create object
     * @param trHeight - the height of the rectangle
     */
    private static void rocketA(int spSize, int shSize, int trHeight) {
        int triangleHeight = trHeight;
        char shade = '#';
        char space = ' ';
        int shadeSize = shSize;  // hold number of shades to create triangle
        int spaceSize = spSize;  // start of space to form triangle
        int midSpace;            // start space for middle of triangles
        int i;                   // index i
        int j;                   // index j

        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;  // create extra space for next row
            shadeSize += 2;  // decrease shades for next row
            System.out.println("");
        }

        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize + 1; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize - 2; j++) {
                System.out.print(shade);
            }
            System.out.println("");
        }

        shadeSize = 1;
        midSpace = triangleHeight * 2 - 1;
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            for(j = 0; j < midSpace; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;  // create extra space for next row
            shadeSize += 2;  // decrease shades for next row
            midSpace -= 2;   // increase spaces for next middle of triangles
            System.out.println("");
        }
    }

    /**
     * Draw out the second option of rocket 2
     * @param spSize - space to form triangle
     * @param shSize - number of shades to create object
     * @param trHeight - the height of the rectangle
     */
    private static void rocketB(int spSize, int shSize, int trHeight) {
        int triangleHeight = trHeight;
        char shade = '#';
        char space = ' ';
        int shadeSize = shSize;  // hold number of shades to create triangle
        int spaceSize = spSize;      // start of space to form triangle
        int midSpace;       // start space for middle of triangles
        int i;              // index i
        int j;              // index j

        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;  // create extra space for next row
            shadeSize += 2;  // decrease shades for next row
            System.out.println("");
        }

        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize + 1; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize - 2; j++) {
                System.out.print(shade);
            }
            System.out.println("");
        }

        shadeSize = triangleHeight;
        midSpace = triangleHeight * 2 - 1;
        spaceSize = 1;

        for(i = 0; i < triangleHeight; i++) {
            System.out.print(space);
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            for(j = 0; j < midSpace; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            System.out.println("");
        }
    }

    /**
     * Draw out the third user's option of rocket 3
     * @param spSize - space to form triangle
     * @param shSize - number of shades to create object
     * @param trHeight - the height of the rectangle
     */
    private static void rocketC(int spSize, int shSize, int trHeight) {
        int triangleHeight = trHeight;
        char shade = '#';
        char space = ' ';
        int shadeSize = shSize;  // hold number of shades to create triangle
        int spaceSize = spSize;      // start of space to form triangle
        int midSpace;       // start space for middle of triangles
        int i;              // index i
        int j;              // index j
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;  // create extra space for next row
            shadeSize += 2;  // decrease shades for next row
            System.out.println("");
        }

        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize + 1; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize - 2; j++) {
                System.out.print(shade);
            }
            System.out.println("");
        }

        spaceSize = 0;
        shadeSize = triangleHeight * 2 - 1; // value for full size triangle
        midSpace = 1;
        for(i = 0; i < triangleHeight; i++) {
            System.out.print(" ");
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            for(j = 0; j < midSpace; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize += 1;  // create extra space for next row
            shadeSize -= 2;  // decrease shades for next row
            midSpace += 2;   // increase spaces for next middle of triangles
            System.out.println("");
        }
    }

    /**
     * The main method starts at program execution, takes the
     * user's input to draw the head of the spaceship size,
     * then the whole body of the ship is built, the user will
     * get to pick which booster to pick for the ship, and the
     * ship will be launched into space
     */
    public static void main(String[] args) throws InterruptedException {
        int triangleHeight;
        char shade = '#';
        char space = ' ';
        int shadeSize = 1;  // hold number of shades to create triangle
        int spaceSize;      // start of space to form triangle
        int midSpace;       // start space for middle of triangles
        int i;              // index i
        int j;              // index j
        char body;
        int smokeCount = 169; // distance of rocket's smoke
        int smokeSize;
        int boosterChoice;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to CS 11 Space Program!");
        System.out.println("We first need a spaceship, how tall should it be?");
        triangleHeight = scnr.nextInt();

        spaceSize = triangleHeight;
        System.out.println("");
        System.out.println("Building spaceship...");
        System.out.println("");
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;       // create extra space for next row
            shadeSize += 2;       // decrease shades for next row
            System.out.println("");
            Thread.sleep(500);    //delay the loop by 500 ms
        }
        System.out.println("");
        System.out.print("Finished! ");
        System.out.println("Now we need the main body, I'll build that for you" +
                " (y/n)");
        body = scnr.next().charAt(0);

        while (body != 'y') {
            System.out.println("Type 'y'! There's no way to abort this mission! Just say 'y");
            body = scnr.next().charAt(0);
        }

        spaceSize = triangleHeight;
        shadeSize = 1;
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;  // create extra space for next row
            shadeSize += 2;  // decrease shades for next row
            System.out.println("");
        }

        spaceSize = triangleHeight;
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < 1; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize - 2; j++) {
                System.out.print(shade);
            }
            System.out.println("");
            Thread.sleep(300);
        }

        System.out.println("");
        System.out.println("   NICE!");
        System.out.println("");

        System.out.println("    1:");
        shadeSize = 1;
        midSpace = triangleHeight * 2 - 1;
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            for(j = 0; j < midSpace; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize -= 1;  // create extra space for next row
            shadeSize += 2;  // decrease shades for next row
            midSpace -= 2;   // increase spaces for next middle of triangles
            System.out.println("");
        }


        System.out.println("");
        System.out.println("    2:");
        shadeSize = triangleHeight;
        midSpace = triangleHeight * 2 - 1;
        spaceSize = 1;
        for(i = 0; i < triangleHeight; i++) {
            System.out.print(space);
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            for(j = 0; j < midSpace; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("    3:");
        shadeSize = triangleHeight * 2 - 1; // value for full size triangle
        midSpace = 1;
        for(i = 0; i < triangleHeight; i++) {
            for(j = 0; j < spaceSize; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            for(j = 0; j < midSpace; j++) {
                System.out.print(space);
            }
            for(j = 0; j < shadeSize; j++) {
                System.out.print(shade);
            }
            spaceSize += 1;  // create extra space for next row
            shadeSize -= 2;  // decrease shades for next row
            midSpace += 2;   // increase spaces for next middle of triangles
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Now we need rocket boosters, which would you like?");
        do {
            boosterChoice  = scnr.nextInt();
        }while(boosterChoice < 1 && boosterChoice > 3);

        System.out.println("");
        System.out.println("Boosters attached!");
        switch (boosterChoice) {
            case 1:
                spaceSize = triangleHeight * 2 - 1;
                shadeSize = 1;
                rocketA(spaceSize, shadeSize, triangleHeight);
                break;

            case 2:
                spaceSize = triangleHeight * 2;
                shadeSize = 1;
                rocketB(spaceSize, shadeSize, triangleHeight);
                break;

            case 3:
                spaceSize = triangleHeight * 2;
                shadeSize = 1;        rocketC(spaceSize, shadeSize, triangleHeight);
                rocketC(spaceSize, shadeSize, triangleHeight);
                break;
        }

        for(i = 0; i < 80; i++) {
            System.out.println("");
        }

        System.out.println("We are now clear for take off!" + " Countdown: T-10");
        for(i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(500);
        }
        for(i = 1; i > 0; i--) {
            System.out.print("BLASTOFF!");
            Thread.sleep(1000);
        }

        for(i = 0; i < 80; i++) {
            System.out.println("");
        }

        if (boosterChoice == 1) {
            rocketA(spaceSize, shadeSize, triangleHeight);
        }
        else if (boosterChoice == 2) {
            rocketB(spaceSize, shadeSize, triangleHeight);
        }
        else {
            rocketC(spaceSize, shadeSize, triangleHeight);
        }

        smokeSize = triangleHeight * 2;
        for(i = 0; i <= smokeCount; i++){
            for(j = 0; j < triangleHeight; j++) {
                System.out.print(space);
            }
            for(j = 0; j < smokeSize + 1; j++) {
                System.out.print("*");
            }
            smokeCount -= 1;
            if(smokeCount % 10 == 0) {
                smokeSize -= 2;  // decrease smoke size after every 10 lines of smoke
                triangleHeight += 1;
            }
            System.out.println("");
            Thread.sleep(100);
        }
        System.out.println("Success!");

        return;
    }
} // End of public class ASCIITriforce

