package com.jannchie.biliob.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Jannchie
 */
@Document("user_star_author_group")
public class UserStarAuthorGroup {
    private ObjectId userId;
    private ObjectId groupId;

    public UserStarAuthorGroup(ObjectId userId, ObjectId groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public ObjectId getGroupId() {
        return groupId;
    }

    public void setGroupId(ObjectId groupId) {
        this.groupId = groupId;
    }
}