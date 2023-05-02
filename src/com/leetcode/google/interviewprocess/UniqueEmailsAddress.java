package com.leetcode.google.interviewprocess;

import java.util.HashSet;
import java.util.Set;

/*
Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters,
the email may contain one or more '.' or '+'.

For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent there
will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain
emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each emails[i], return the number of different
addresses that actually receive mails.
 */
public class UniqueEmailsAddress {
    /**
    1 <= emails.length <= 100
    1 <= emails[i].length <= 100
    emails[i] consist of lowercase English letters, '+', '.' and '@'.
    Each emails[i] contains exactly one '@' character.
    All local and domain names are non-empty.
    Local names do not start with a '+' character.
    Domain names end with the ".com" suffix.
    */

    public static void main(String[] args) {
        //String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        //String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        String[] emails = {"linqmafia@leet+code.com","linqmafia@code.com"};
        Set<String> uniqueEmails = new HashSet<>();
        if(emails.length <= 100) {
            for(String email: emails) {
                if(isValidEmail(email)) {
                    String[] atSplit = email.split("@");
                    atSplit[0] = atSplit[0].replaceAll("\\.","");
                    if(atSplit[0].contains("+")) {
                        atSplit[0] = atSplit[0].substring(0,atSplit[0].indexOf("+"));
                    }
                    uniqueEmails.add(atSplit[0] + "@" + atSplit[1]);
                }
            }
        }
        System.out.println("size: "+uniqueEmails.size());
        System.out.println(uniqueEmails.toString());
    }
    public static boolean isValidEmail(String email) {
        boolean validEmail = false;
        if(email.length() <= 100 && email.length() >= 1) {
            validEmail = email.matches("^([a-z]+[a-z\\+\\.]*)@([a-z]+[a-z\\.\\+]*)\\.[com]+$");
        }
        return validEmail;
    }

}
