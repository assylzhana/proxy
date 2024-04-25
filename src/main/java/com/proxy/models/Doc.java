package com.proxy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="docs")
@Getter
@Setter
public class Doc {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String docName;
    private String docType;

    @Lob
    private byte[] data;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;


    public Doc() {}

    public Doc(String docName, String docType, byte[] data) {
        super();
        this.docName = docName;
        this.docType = docType;
        this.data = data;
    }


    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}