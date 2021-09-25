package com.baronasu;

import com.baronasu.model.EmailAccount;
import javafx.scene.control.TreeItem;

public class EmailManager {

//    Folder handling:
    private TreeItem<String> foldersRoot = new TreeItem<>("");

    public TreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        TreeItem<String> treeItem = new TreeItem<>(emailAccount.getAddress());
        treeItem.setExpanded(true);
        treeItem.getChildren().add(new TreeItem<String>("INBOX"));
        treeItem.getChildren().add(new TreeItem<String>("SENT"));
        treeItem.getChildren().add(new TreeItem<String>("SPAM"));
        treeItem.getChildren().add(new TreeItem<String>("TRASH"));
        foldersRoot.getChildren().add(treeItem);
    }
}
