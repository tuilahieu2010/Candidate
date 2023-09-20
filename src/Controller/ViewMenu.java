/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Controller.Manager;
import Model.Candidate;
import Model.Library;

import View.Menu;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ViewMenu extends Menu<String> {
    ArrayList<Candidate> candidates;
    static String[] mc = {"Experience","fresher","intership","searching","exit"};

    public ViewMenu(ArrayList<Candidate> candidates) {
        super("PROGRAMMING", mc);
        this.candidates = candidates;
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                Manager.createCandidate(candidates, 0);
                break;
            case 2:
                Manager.createCandidate(candidates, 1);
                break;
            case 3:
                Manager.createCandidate(candidates, 2);
                break;
            case 4:
                Manager.searchCandidate(candidates);
                break;
            case 5:
                return;
        }
    }
}
