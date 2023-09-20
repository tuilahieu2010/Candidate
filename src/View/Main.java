/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.ViewMenu;
import Model.Candidate;


import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        ViewMenu menu = new ViewMenu(candidates);
        menu.run();
    }
}