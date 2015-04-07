package wordjumble;

import javax.swing.*;

/**
 * @title WordJumble (based off of WordJumbleIntro)
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 7-Apr-2015 12:33:21 PM
 * @purpose The purpose of this program is to create every possible combo of letter from a given set of letters.
 */
public class WordJumble {

    public static void main(String[] args) {
        String letters;
        letters=JOptionPane.showInputDialog("Please enter a word.");//get word to scramble
        jumbleWords(letters, "");//call recursive method
    }

    public static void jumbleWords(String word, String jumbLet) {
        int pos;
        String remainingLetters;
        String origWord = word;
        String origJumbledLetters = jumbLet;
        if (word.length() == 1) {
            System.out.println(jumbLet + word);//output the word when this branch of the recursion is done.
        } else {//continue with recursive calculations.
            for (pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                        + origWord.substring(pos + 1, origWord.length());
                //recursive call to jumbleWords()
                jumbleWords(remainingLetters,
                        origJumbledLetters + origWord.charAt(pos));
            }
        }
    }
}
