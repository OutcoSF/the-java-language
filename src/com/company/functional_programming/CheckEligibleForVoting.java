package com.company.functional_programming;

class CheckPersonEligibleForVoting implements CheckPerson {
    public boolean test(Person p) {
        return p.getAge() >= 18;
    }
}
