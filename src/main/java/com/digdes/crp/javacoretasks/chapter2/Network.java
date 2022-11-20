package com.digdes.crp.javacoretasks.chapter2;

import java.util.ArrayList;

public class Network {

    public class Member {

        private String name;

        public Member(String name) {
            this.name = name;
        }

        public Member enroll(String name) {
            Member newMember = new Member(name);
            members.add(newMember);
            return newMember;
        }

        public void leave() {
            members.remove(this);
        }
    }

    private ArrayList<Member> members;


}
