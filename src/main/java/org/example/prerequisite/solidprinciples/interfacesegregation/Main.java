package org.example.prerequisite.solidprinciples.interfacesegregation;

class RegularUserImpl implements RegularUser {

    @Override
    public void login() {
        System.out.println("Regular user logged in");
    }

    @Override
    public void logout() {
        System.out.println("Regular user logged out");
    }

    @Override
    public void browseContent() {
        System.out.println("Regular user browsing content");
    }
}

class AdministratorImpl implements Administrator {

    @Override
    public void login() {
        System.out.println("Administrator logged in");
    }

    @Override
    public void logout() {
        System.out.println("Administrator logged out");
    }

    @Override
    public void manageUsers() {
        System.out.println("Administrator managing users");
    }

    @Override
    public void manageContent() {
        System.out.println("Administrator managing content");
    }
}

class Main {
    public static void main(String[] args) {
        RegularUser regularUser = new RegularUserImpl();
        regularUser.login();
        regularUser.browseContent();
        regularUser.logout();

        Administrator administrator = new AdministratorImpl();
        administrator.login();
        administrator.manageUsers();
        administrator.manageContent();
        administrator.logout();
    }
}
