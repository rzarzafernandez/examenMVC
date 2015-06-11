/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 *
 * @author rzarzafernandez
 */
public class Controlador {
    
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Presentacion pre = new Presentacion();
        pre.chooseArea(mod);

        

        if (mod.shapeType.equals("square")) {
            areaSquare(mod,pre);
        }
        if (mod.shapeType.equals("rectangle")) {
            areaRectangle(mod,pre);
        }
        if (mod.shapeType.equals("triangle")) {
            areaTriangle(mod,pre);
        }
        if (mod.shapeType.equals("circle")) {
            areaCircle(mod,pre);
        } 
    }
    
     private static void areaSquare(Modelo mod, Presentacion pre) {
        
        pre.dataSquare(mod);
        mod.area = mod.side1 * mod.side1;
        pre.printArea(mod);
    }

    private static void areaRectangle(Modelo mod, Presentacion pre) {
        pre.dataRectangle(mod);
        mod.area = mod.side1 * mod.side2;
        pre.printArea(mod);
    }

    private static void areaTriangle(Modelo mod, Presentacion pre) {
        pre.dataTriangle(mod);
        mod.area = (float) (0.5 * mod.side1 * mod.side2);
        pre.printArea(mod);
    }

    private static void areaCircle(Modelo mod, Presentacion pre) {
        pre.dataCircle(mod);
        mod.area = mod.side1 * mod.side1;
        mod.area = (float) (3.14159265 * mod.area);
        pre.printArea(mod);
    }

    
    
}
 