package org.example.prerequisite.solidprinciples.interfacesegregation;

// Interface Segregation states that clients should not be forced to depend on interfaces they do not use.
// It suggests that you should break down large interfaces into smaller, more specific ones so that clients only need
// to know about the methods that are relevant to them

// Interface representing common functionalities for all users
public interface User {
    void login();
    void logout();
}

// Interface representing functionalities specific to regular users
interface RegularUser extends User {
    void browseContent();
}

// Interface representing functionalities specific to administrators
interface Administrator extends User {
    void manageUsers();
    void manageContent();
}
