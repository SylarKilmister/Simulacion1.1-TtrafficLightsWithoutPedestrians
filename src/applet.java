
import java.applet.Applet;
import java.awt.Color;
import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class applet extends Applet implements Runnable {

    Thread hilo1;
    JTextField verde1, naranja1, rojo1,
            verde2, naranja2, rojo2,
            verde3, naranja3, rojo3,
            verde4, naranja4, rojo4,
            verdeP1, rojoP1,
            verdeP2, rojoP2,
            verdeP3, rojoP3,
            verdeP4, rojoP4,
            verdeP5, rojoP5,
            verdeP6, rojoP6,
            verdeP7, rojoP7,
            verdeP8, rojoP8;

    JTextArea pasto, carretera1, carretera2, semaforo1, semaforo2, semaforo3,
            semaforo4, calle1, calle2, call3, calle, carro1, carro2, carro3,
            carro4, lineaB, semaP1, semaP2, semaP3, semaP4, semaP5, semaP6, semaP7,
            semaP8;

    String variable;
    int time1, time2, ciclo=30;

    public void init() {
        setSize(1500, 950);
        setLayout(null);

        ////////////semaforos//////////////////////////
        verde1 = new JTextField();  /////////Semaforo1
        verde1.setBackground(Color.white);
        verde1.setBounds(634, 630, 19, 19);
        add(verde1);
        naranja1 = new JTextField();
        naranja1.setBackground(Color.white);
        naranja1.setBounds(594, 630, 19, 19);
        add(naranja1);
        rojo1 = new JTextField();
        rojo1.setBackground(Color.white);
        rojo1.setBounds(554, 630, 19, 19);
        add(rojo1);

        verde2 = new JTextField();  /////////Semaforo2
        verde2.setBackground(Color.white);
        verde2.setBounds(804, 301, 19, 19);
        add(verde2);
        naranja2 = new JTextField();
        naranja2.setBackground(Color.white);
        naranja2.setBounds(844, 301, 19, 19);
        add(naranja2);
        rojo2 = new JTextField();
        rojo2.setBackground(Color.white);
        rojo2.setBounds(884, 301, 19, 19);
        add(rojo2);

        verde3 = new JTextField();  /////////Semaforo3
        verde3.setBackground(Color.white);
        verde3.setBounds(939, 514, 19, 19);
        add(verde3);
        naranja3 = new JTextField();
        naranja3.setBackground(Color.white);
        naranja3.setBounds(939, 554, 19, 19);
        add(naranja3);
        rojo3 = new JTextField();
        rojo3.setBackground(Color.white);
        rojo3.setBounds(939, 594, 19, 19);
        add(rojo3);

        verde4 = new JTextField();  /////////Semaforo4
        verde4.setBackground(Color.white);
        verde4.setBounds(503, 416, 19, 19);
        add(verde4);
        naranja4 = new JTextField();
        naranja4.setBackground(Color.white);
        naranja4.setBounds(503, 376, 19, 19);
        add(naranja4);
        rojo4 = new JTextField();
        rojo4.setBackground(Color.white);
        rojo4.setBounds(503, 336, 19, 19);
        add(rojo4);
        ////////////////////////////////////////////////////

        ////////////marco de semaforos/////////////
        semaforo1 = new JTextArea();
        semaforo1.setBackground(Color.DARK_GRAY);
        semaforo1.setBounds(552, 628, 103, 22);
        add(semaforo1);

        semaforo2 = new JTextArea();
        semaforo2.setBackground(Color.DARK_GRAY);
        semaforo2.setBounds(802, 300, 103, 21);
        add(semaforo2);

        semaforo3 = new JTextArea();
        semaforo3.setBackground(Color.DARK_GRAY);
        semaforo3.setBounds(937, 511, 21, 103);
        add(semaforo3);

        semaforo4 = new JTextArea();
        semaforo4.setBackground(Color.DARK_GRAY);
        semaforo4.setBounds(502, 334, 21, 103);
        add(semaforo4);
        ///////////////////////////////////////////

        /////////////////carros////////////////////////
        carro1 = new JTextArea(); //carrito1 (norte a sur)
        carro1.setBackground(Color.cyan);
        carro1.setBounds(640, 145, 60, 100);
        add(carro1);

        carro2 = new JTextArea(); //carrito2 (sur a norte)
        carro2.setBackground(Color.GREEN);
        carro2.setBounds(750, 720, 60, 100);
        add(carro2);

        carro3 = new JTextArea(); //carrito3 (este a oeste)
        carro3.setBackground(Color.PINK);
        carro3.setBounds(325, 575, 100, 60);
        add(carro3);

        carro4 = new JTextArea(); //carrito4 (oeste a este)
        carro4.setBackground(Color.ORANGE);
        carro4.setBounds(1020, 392, 100, 60);
        add(carro4);

        ///////////////////////////////////////////////////
        ///////////marco semaforos peatonales//////
        semaP1 = new JTextArea(); ///1
        semaP1.setBackground(Color.BLACK);
        semaP1.setBounds(995, 275, 25, 25);
        add(semaP1);

        semaP2 = new JTextArea(); ////////2
        semaP2.setBackground(Color.BLACK);
        semaP2.setBounds(995, 650, 25, 25);
        add(semaP2);

        semaP3 = new JTextArea(); //3
        semaP3.setBackground(Color.black);
        semaP3.setBounds(960, 240, 25, 25);
        add(semaP3);

        semaP4 = new JTextArea(); //4
        semaP4.setBackground(Color.black);
        semaP4.setBounds(475, 240, 25, 25);
        add(semaP4);

        semaP5 = new JTextArea(); //5
        semaP5.setBackground(Color.BLACK);
        semaP5.setBounds(440, 275, 25, 25);
        add(semaP5);

        semaP6 = new JTextArea(); //6
        semaP6.setBackground(Color.BLACK);
        semaP6.setBounds(440, 650, 25, 25);
        add(semaP6);

        semaP7 = new JTextArea(); //7
        semaP7.setBackground(Color.black);
        semaP7.setBounds(475, 685, 25, 25);
        add(semaP7);

        semaP8 = new JTextArea(); //8
        semaP8.setBackground(Color.BLACK);
        semaP8.setBounds(960, 685, 25, 25);
        add(semaP8);

        ///////////////////////////////////////////
        ////////////////Semafotos Peatonales/////////////////////
        verdeP1 = new JTextField();  /////////Semaforo1
        verdeP1.setBackground(Color.white);
        verdeP1.setBounds(1000, 265, 15, 10);
        add(verdeP1);
        rojoP1 = new JTextField();  /////////Semaforo1
        rojoP1.setBackground(Color.white);
        rojoP1.setBounds(1000, 300, 15, 10);
        add(rojoP1);

        verdeP2 = new JTextField();  /////////Semaforo2
        verdeP2.setBackground(Color.white);
        verdeP2.setBounds(1000, 640, 15, 10);
        add(verdeP2);
        rojoP2 = new JTextField();  /////////Semaforo2
        rojoP2.setBackground(Color.white);
        rojoP2.setBounds(1000, 675, 15, 10);
        add(rojoP2);

        verdeP3 = new JTextField();  /////////Semaforo3
        verdeP3.setBackground(Color.white);
        verdeP3.setBounds(950, 245, 10, 15);
        add(verdeP3);
        rojoP3 = new JTextField();  /////////Semaforo3
        rojoP3.setBackground(Color.white);
        rojoP3.setBounds(985, 245, 10, 15);
        add(rojoP3);

        verdeP4 = new JTextField();  /////////Semaforo4
        verdeP4.setBackground(Color.white);
        verdeP4.setBounds(465, 245, 10, 15);
        add(verdeP4);
        rojoP4 = new JTextField();  /////////Semaforo4
        rojoP4.setBackground(Color.white);
        rojoP4.setBounds(500, 245, 10, 15);
        add(rojoP4);

        verdeP5 = new JTextField();  /////////Semaforo5
        verdeP5.setBackground(Color.white);
        verdeP5.setBounds(445, 265, 15, 10);
        add(verdeP5);
        rojoP5 = new JTextField();  /////////Semaforo5
        rojoP5.setBackground(Color.white);
        rojoP5.setBounds(445, 300, 15, 10);
        add(rojoP5);

        verdeP6 = new JTextField();  /////////Semaforo6
        verdeP6.setBackground(Color.white);
        verdeP6.setBounds(445, 640, 15, 10);
        add(verdeP6);
        rojoP6 = new JTextField();  /////////Semaforo6
        rojoP6.setBackground(Color.white);
        rojoP6.setBounds(445, 675, 15, 10);
        add(rojoP6);

        verdeP7 = new JTextField();  /////////Semaforo7
        verdeP7.setBackground(Color.white);
        verdeP7.setBounds(465, 690, 10, 15);
        add(verdeP7);
        rojoP7 = new JTextField();  /////////Semaforo7
        rojoP7.setBackground(Color.white);
        rojoP7.setBounds(500, 690, 10, 15);
        add(rojoP7);

        verdeP8 = new JTextField();  /////////Semaforo8
        verdeP8.setBackground(Color.white);
        verdeP8.setBounds(950, 690, 10, 15);
        add(verdeP8);
        rojoP8 = new JTextField();  /////////Semaforo8
        rojoP8.setBackground(Color.white);
        rojoP8.setBounds(985, 690, 10, 15);
        add(rojoP8);

        ///////////////////////////////////////////////////////
        ///////////////linia stop////////////////////
        lineaB = new JTextArea(); //linnea stop
        lineaB.setBackground(Color.LIGHT_GRAY);
        lineaB.setBounds(742, 695, 210, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea stop
        lineaB.setBackground(Color.LIGHT_GRAY);
        lineaB.setBounds(505, 250, 210, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea stop
        lineaB.setBackground(Color.LIGHT_GRAY);
        lineaB.setBounds(447, 475, 8, 167);
        add(lineaB);
        lineaB = new JTextArea(); //linnea stop
        lineaB.setBackground(Color.LIGHT_GRAY);
        lineaB.setBounds(1005, 305, 8, 150);
        add(lineaB);
        /////////////////////////////////////////////

        //////////////paso peatonal/////////////////////
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(505, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(525, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(545, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(565, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(585, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(605, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(625, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(645, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(665, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(685, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(705, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(725, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(745, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(765, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(785, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(805, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(825, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(845, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(865, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(885, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(905, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(925, 265, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(945, 265, 8, 35);
        add(lineaB);

        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(505, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(525, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(545, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(565, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(585, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(605, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(625, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(645, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(665, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(685, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(705, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(725, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(745, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(765, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(785, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(805, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(825, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(845, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(865, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(885, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(905, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(925, 651, 8, 35);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(945, 651, 8, 35);
        add(lineaB);

        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 305, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 325, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 345, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 365, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 385, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 405, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 425, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 445, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 465, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 485, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 505, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 525, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 545, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 565, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 585, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 608, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(465, 630, 35, 8);
        add(lineaB);

        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 305, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 325, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 345, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 365, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 385, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 405, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 425, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 445, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 465, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 485, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 505, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 525, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 545, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 565, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 585, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 608, 35, 8);
        add(lineaB);
        lineaB = new JTextArea(); //linnea peatonal
        lineaB.setBackground(Color.white);
        lineaB.setBounds(961, 630, 35, 8);
        add(lineaB);
        ////////////////////////////////////////////////

        ///////////////////////////////////////////////
        ////////////////lineas amarillas////////////////
        lineaB = new JTextArea(); //linnea amarilla
        lineaB.setBackground(Color.yellow);
        lineaB.setBounds(720, 0, 10, 260);
        add(lineaB);
        lineaB = new JTextArea(); //linnea amarilla
        lineaB.setBackground(Color.yellow);
        lineaB.setBounds(720, 694, 10, 280);
        add(lineaB);
        lineaB = new JTextArea(); //linnea amarilla
        lineaB.setBackground(Color.yellow);
        lineaB.setBounds(0, 460, 455, 10);
        add(lineaB);
        lineaB = new JTextArea(); //linnea amarilla
        lineaB.setBackground(Color.yellow);
        lineaB.setBounds(1005, 460, 500, 10);
        add(lineaB);
        ////////////////////////////////////////////////

        /////////////////lineas blancas//////////////////
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 20, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 70, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 120, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 170, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 220, 5, 20);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 20, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 70, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 120, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 170, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 220, 5, 20);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 720, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 770, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 820, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 870, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(600, 920, 5, 20);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 720, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 770, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 820, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 870, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 920, 5, 20);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(840, 970, 5, 20);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(0, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(50, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(100, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(150, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(200, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(250, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(300, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(350, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(400, 560, 20, 5);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1030, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1080, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1130, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1180, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1230, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1280, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1330, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1380, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1430, 560, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1480, 560, 20, 5);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(0, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(50, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(100, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(150, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(200, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(250, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(300, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(350, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(400, 380, 20, 5);
        add(lineaB);

        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1030, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1080, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1130, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1180, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1230, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1280, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1330, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1380, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1430, 380, 20, 5);
        add(lineaB);
        lineaB = new JTextArea(); //linnea blanca N/S
        lineaB.setBackground(Color.white);
        lineaB.setBounds(1480, 380, 20, 5);
        add(lineaB);
        /////////////////////////////////////////////////////

        ///////////////carreteras/////////////////////////////
        carretera2 = new JTextArea(); //carretera oriente poniente
        carretera2.setBackground(Color.black);
        carretera2.setBounds(0, 300, 1500, 350);
        add(carretera2);

        carretera1 = new JTextArea(); //carretera norte sur
        carretera1.setBackground(Color.black);
        carretera1.setBounds(500, 0, 460, 1000);
        add(carretera1);
        ///////////////////////////////////////////////////////

        //////////////////////calles/////////////////////////
        lineaB = new JTextArea(); //calle vertical
        lineaB.setBackground(Color.darkGray);
        lineaB.setBounds(465, 0, 535, 1100);
        add(lineaB);
        lineaB = new JTextArea(); //calle horizontal
        lineaB.setBackground(Color.darkGray);
        lineaB.setBounds(0, 265, 1500, 430);
        add(lineaB);
        ////////////////////////////////////////////////////

        /////////////pastito*////////////
        pasto = new JTextArea();
        pasto.setBackground(Color.GREEN);
        pasto.setBounds(0, 0, 1500, 950);
        add(pasto);
        /////////////////////////////////////////

        hilo1 = new Thread(this);
        hilo1.start();

    }

    @Override
    public void run() {
        Thread variable = Thread.currentThread();
        while (variable == hilo1) {
            verde1.setBackground(Color.green); //inicializador 1 Norte a sur
            rojo1.setBackground(Color.white);
            rojo2.setBackground(Color.red);
            rojo3.setBackground(Color.red);
            rojo4.setBackground(Color.red);
            
            verdeP1.setBackground(Color.green); //peatonal vertical
            rojoP1.setBackground(Color.green);
            verdeP2.setBackground(Color.green);
            rojoP2.setBackground(Color.green);
            
            verdeP3.setBackground(Color.red); //peatonal horizontal
            rojoP3.setBackground(Color.red);
            verdeP4.setBackground(Color.red);
            rojoP4.setBackground(Color.red);
            
            verdeP5.setBackground(Color.green); //peatonal vertical
            rojoP5.setBackground(Color.green);
            verdeP6.setBackground(Color.green);
            rojoP6.setBackground(Color.green);
            
            verdeP7.setBackground(Color.red); //peatonal horizontal
            rojoP7.setBackground(Color.red);
            verdeP8.setBackground(Color.red);
            rojoP8.setBackground(Color.red);
            

            for (time1 = 1; time1 <= ciclo; time1++) {
                delayTiempo();
                carro1.setBounds(640, (time1 * 50) + 145, 60, 100);
                //carro2.setBounds(750, (time1 * -9)+720, 60, 100);
                //carro3.setBounds((time1 * 9)+325, 575, 100, 60);
                //carro4.setBounds((time1 * -9)+1020, 392, 100, 60);
            }
            verde1.setBackground(Color.white);
            naranja1.setBackground(Color.orange); //1
            delayTiempoSmall();
            verdeP1.setBackground(Color.white); //peatonal vertical
            rojoP1.setBackground(Color.white);
            verdeP2.setBackground(Color.white);
            rojoP2.setBackground(Color.white);
            verdeP5.setBackground(Color.white); //peatonal vertical
            rojoP5.setBackground(Color.white);
            verdeP6.setBackground(Color.white);
            rojoP6.setBackground(Color.white);
            naranja1.setBackground(Color.white);
            delayTiempoSmall();
            verdeP1.setBackground(Color.green); //peatonal vertical
            rojoP1.setBackground(Color.green);
            verdeP2.setBackground(Color.green);
            rojoP2.setBackground(Color.green);
            verdeP5.setBackground(Color.green); //peatonal vertical
            rojoP5.setBackground(Color.green);
            verdeP6.setBackground(Color.green);
            rojoP6.setBackground(Color.green);
            naranja1.setBackground(Color.orange); //2
            delayTiempoSmall();
            verdeP1.setBackground(Color.white); //peatonal vertical
            rojoP1.setBackground(Color.white);
            verdeP2.setBackground(Color.white);
            rojoP2.setBackground(Color.white);
            verdeP5.setBackground(Color.white); //peatonal vertical
            rojoP5.setBackground(Color.white);
            verdeP6.setBackground(Color.white);
            rojoP6.setBackground(Color.white);
            naranja1.setBackground(Color.white);
            naranja1.setBackground(Color.white);
            delayTiempoSmall();
            verdeP1.setBackground(Color.green); //peatonal vertical
            rojoP1.setBackground(Color.green);
            verdeP2.setBackground(Color.green);
            rojoP2.setBackground(Color.green);
            verdeP5.setBackground(Color.green); //peatonal vertical
            rojoP5.setBackground(Color.green);
            verdeP6.setBackground(Color.green);
            rojoP6.setBackground(Color.green);
            naranja1.setBackground(Color.orange);//3
            delayTiempoSmall();
            verdeP1.setBackground(Color.white); //peatonal vertical
            rojoP1.setBackground(Color.white);
            verdeP2.setBackground(Color.white);
            rojoP2.setBackground(Color.white);
            verdeP5.setBackground(Color.white); //peatonal vertical
            rojoP5.setBackground(Color.white);
            verdeP6.setBackground(Color.white);
            rojoP6.setBackground(Color.white);
            naranja1.setBackground(Color.white);
            naranja1.setBackground(Color.white);
            naranja1.setBackground(Color.white);
            delayTiempoSmall();
            verde3.setBackground(Color.green); ///inizializador 2 Este a Oeste
            rojo3.setBackground(Color.white);
            rojo1.setBackground(Color.red);
            rojo2.setBackground(Color.red);
            rojo4.setBackground(Color.red);
            
            verdeP1.setBackground(Color.red); //peatonal vertical
            rojoP1.setBackground(Color.red);
            verdeP2.setBackground(Color.red);
            rojoP2.setBackground(Color.red);
            verdeP5.setBackground(Color.red); //peatonal vertical
            rojoP5.setBackground(Color.red);
            verdeP6.setBackground(Color.red);
            rojoP6.setBackground(Color.red);
            
            verdeP3.setBackground(Color.green); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.green);
            rojoP4.setBackground(Color.green);
            verdeP7.setBackground(Color.green); //peatonal horizontal
            rojoP7.setBackground(Color.green);
            verdeP8.setBackground(Color.green);
            rojoP8.setBackground(Color.green);
            
            

            for (time1 = 1; time1 <= ciclo; time1++) {
                delayTiempo();
                carro3.setBounds((time1 * 50) + 325, 575, 100, 60);
            }
            verde3.setBackground(Color.white);
            naranja3.setBackground(Color.orange); //1
            delayTiempoSmall();
            verdeP3.setBackground(Color.white); //peatonal horizontal
            rojoP3.setBackground(Color.white);
            verdeP4.setBackground(Color.white);
            rojoP4.setBackground(Color.white);
            verdeP7.setBackground(Color.white); //peatonal horizontal
            rojoP7.setBackground(Color.white);
            verdeP8.setBackground(Color.white);
            rojoP8.setBackground(Color.white);
            naranja3.setBackground(Color.white);
            delayTiempoSmall();
            verdeP3.setBackground(Color.green); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.green);
            rojoP4.setBackground(Color.green);
            verdeP7.setBackground(Color.green); //peatonal horizontal
            rojoP7.setBackground(Color.green);
            verdeP8.setBackground(Color.green);
            rojoP8.setBackground(Color.green);
            naranja3.setBackground(Color.orange); //2
            delayTiempoSmall();
            verdeP3.setBackground(Color.white); //peatonal horizontal
            rojoP3.setBackground(Color.white);
            verdeP4.setBackground(Color.white);
            rojoP4.setBackground(Color.white);
            verdeP7.setBackground(Color.white); //peatonal horizontal
            rojoP7.setBackground(Color.white);
            verdeP8.setBackground(Color.white);
            rojoP8.setBackground(Color.white);
            naranja3.setBackground(Color.white);
            naranja3.setBackground(Color.white);
            delayTiempoSmall();
            verdeP3.setBackground(Color.green); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.green);
            rojoP4.setBackground(Color.green);
            verdeP7.setBackground(Color.green); //peatonal horizontal
            rojoP7.setBackground(Color.green);
            verdeP8.setBackground(Color.green);
            rojoP8.setBackground(Color.green);
            naranja3.setBackground(Color.orange);//3
            delayTiempoSmall();
            verdeP3.setBackground(Color.white); //peatonal horizontal
            rojoP3.setBackground(Color.white);
            verdeP4.setBackground(Color.white);
            rojoP4.setBackground(Color.white);
            verdeP7.setBackground(Color.white); //peatonal horizontal
            rojoP7.setBackground(Color.white);
            verdeP8.setBackground(Color.white);
            rojoP8.setBackground(Color.white);
            naranja3.setBackground(Color.white);
            naranja3.setBackground(Color.white);
            naranja3.setBackground(Color.white);
            delayTiempoSmall();
            rojo3.setBackground(Color.red);
            verde2.setBackground(Color.green); ///inizializador 3 sur a norte
            rojo2.setBackground(Color.white);
            rojo1.setBackground(Color.red);
            rojo3.setBackground(Color.red);
            rojo4.setBackground(Color.red);
            
            verdeP1.setBackground(Color.green); //peatonal vertical
            rojoP1.setBackground(Color.green);
            verdeP2.setBackground(Color.green);
            rojoP2.setBackground(Color.green);
            verdeP5.setBackground(Color.green); //peatonal vertical
            rojoP5.setBackground(Color.green);
            verdeP6.setBackground(Color.green);
            rojoP6.setBackground(Color.green);
            verdeP3.setBackground(Color.red); //peatonal horizontal
            rojoP3.setBackground(Color.red);
            verdeP4.setBackground(Color.red);
            rojoP4.setBackground(Color.red);
            verdeP7.setBackground(Color.red); //peatonal horizontal
            rojoP7.setBackground(Color.red);
            verdeP8.setBackground(Color.red);
            rojoP8.setBackground(Color.red);
            
            
            
            
            
            for (time1 = 1; time1 <= ciclo; time1++) {
                delayTiempo();
                carro2.setBounds(750, (time1 * -50)+720, 60, 100);
            }
            verde2.setBackground(Color.white);
            naranja2.setBackground(Color.orange); //1
            delayTiempoSmall();
            verdeP1.setBackground(Color.white); //peatonal vertical
            rojoP1.setBackground(Color.white);
            verdeP2.setBackground(Color.white);
            rojoP2.setBackground(Color.white);
            verdeP5.setBackground(Color.white); //peatonal vertical
            rojoP5.setBackground(Color.white);
            verdeP6.setBackground(Color.white);
            rojoP6.setBackground(Color.white);
            naranja2.setBackground(Color.white);
            delayTiempoSmall();
            verdeP1.setBackground(Color.green); //peatonal vertical
            rojoP1.setBackground(Color.green);
            verdeP2.setBackground(Color.green);
            rojoP2.setBackground(Color.green);
            verdeP5.setBackground(Color.green); //peatonal vertical
            rojoP5.setBackground(Color.green);
            verdeP6.setBackground(Color.green);
            rojoP6.setBackground(Color.green);
            naranja2.setBackground(Color.orange); //2
            delayTiempoSmall();
            verdeP1.setBackground(Color.white); //peatonal vertical
            rojoP1.setBackground(Color.white);
            verdeP2.setBackground(Color.white);
            rojoP2.setBackground(Color.white);
            verdeP5.setBackground(Color.white); //peatonal vertical
            rojoP5.setBackground(Color.white);
            verdeP6.setBackground(Color.white);
            rojoP6.setBackground(Color.white);
            naranja2.setBackground(Color.white);
            delayTiempoSmall();
            verdeP1.setBackground(Color.green); //peatonal vertical
            rojoP1.setBackground(Color.green);
            verdeP2.setBackground(Color.green);
            rojoP2.setBackground(Color.green);
            verdeP5.setBackground(Color.green); //peatonal vertical
            rojoP5.setBackground(Color.green);
            verdeP6.setBackground(Color.green);
            rojoP6.setBackground(Color.green);
            naranja2.setBackground(Color.orange);//3
            delayTiempoSmall();
            verdeP1.setBackground(Color.white); //peatonal vertical
            rojoP1.setBackground(Color.white);
            verdeP2.setBackground(Color.white);
            rojoP2.setBackground(Color.white);
            verdeP5.setBackground(Color.white); //peatonal vertical
            rojoP5.setBackground(Color.white);
            verdeP6.setBackground(Color.white);
            rojoP6.setBackground(Color.white);
            naranja2.setBackground(Color.white);
            delayTiempoSmall();
            verde4.setBackground(Color.green); ///inizializador 4 oueste a este
            rojo4.setBackground(Color.white);
            rojo1.setBackground(Color.red);
            rojo2.setBackground(Color.red);
            rojo3.setBackground(Color.red);
            
            verdeP1.setBackground(Color.red); //peatonal vertical
            rojoP1.setBackground(Color.red);
            verdeP2.setBackground(Color.red);
            rojoP2.setBackground(Color.red);
            verdeP5.setBackground(Color.red); //peatonal vertical
            rojoP5.setBackground(Color.red);
            verdeP6.setBackground(Color.red);
            rojoP6.setBackground(Color.red);
            
            verdeP3.setBackground(Color.green); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.green);
            rojoP4.setBackground(Color.green);
            verdeP7.setBackground(Color.green); //peatonal horizontal
            rojoP7.setBackground(Color.green);
            verdeP8.setBackground(Color.green);
            rojoP8.setBackground(Color.green);
            
            
            
            for (time1 = 1; time1 <= ciclo; time1++) {
                delayTiempo();
                carro4.setBounds((time1 * -50)+1020, 392, 100, 60);
            }
            verde4.setBackground(Color.white);
            naranja4.setBackground(Color.orange); //1
            delayTiempoSmall();
            verdeP3.setBackground(Color.white); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.white);
            rojoP4.setBackground(Color.white);
            verdeP7.setBackground(Color.white); //peatonal horizontal
            rojoP7.setBackground(Color.white);
            verdeP8.setBackground(Color.white);
            rojoP8.setBackground(Color.white);
            naranja4.setBackground(Color.white);
            delayTiempoSmall();
            verdeP3.setBackground(Color.green); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.green);
            rojoP4.setBackground(Color.green);
            verdeP7.setBackground(Color.green); //peatonal horizontal
            rojoP7.setBackground(Color.green);
            verdeP8.setBackground(Color.green);
            rojoP8.setBackground(Color.green);
            naranja4.setBackground(Color.orange); //2
            delayTiempoSmall();
            verdeP3.setBackground(Color.white); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.white);
            rojoP4.setBackground(Color.white);
            verdeP7.setBackground(Color.white); //peatonal horizontal
            rojoP7.setBackground(Color.white);
            verdeP8.setBackground(Color.white);
            rojoP8.setBackground(Color.white);
            naranja4.setBackground(Color.white);
            delayTiempoSmall();
            verdeP3.setBackground(Color.green); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.green);
            rojoP4.setBackground(Color.green);
            verdeP7.setBackground(Color.green); //peatonal horizontal
            rojoP7.setBackground(Color.green);
            verdeP8.setBackground(Color.green);
            rojoP8.setBackground(Color.green);
            naranja4.setBackground(Color.orange);//3
            delayTiempoSmall();
            verdeP3.setBackground(Color.white); //peatonal horizontal
            rojoP3.setBackground(Color.green);
            verdeP4.setBackground(Color.white);
            rojoP4.setBackground(Color.white);
            verdeP7.setBackground(Color.white); //peatonal horizontal
            rojoP7.setBackground(Color.white);
            verdeP8.setBackground(Color.white);
            rojoP8.setBackground(Color.white);
            naranja4.setBackground(Color.white);
            delayTiempoSmall();

        }
    }

    public static void delayTiempo() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

    public static void delayTiempoSmall() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
    }

}
