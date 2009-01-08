package de.berlios.moche.model;

import java.util.Date;

/**
 * Podstawowa klasa aplikacji. Modeluje problem zgłaszany w związku z wybranym produktem.
 * 
 * @author jjhop
 */
public class Issue {

    private Long issueId;
    private String summary;
    private String shortDescription;
    private String fullDescription;
    private Date createDate;
    private Status currentStatus;

    private Product product;
    private ProductVersion productVersion;
    private ProductModule productModule;

    public Long getIssueId() { return issueId; }
    public void setIssueId(Long issueId) { this.issueId = issueId; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public Date getCreateDate() { return createDate; }
    public void setCreateDate(Date createDate) { this.createDate = createDate; }

    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public String getFullDescription() { return fullDescription; }
    public void setFullDescription(String fullDescription) { this.fullDescription = fullDescription; }

    public Status getCurrentStatus() { return currentStatus; }
    public void setCurrentStatus(Status currentStatus) {
        if (currentStatus == null) {
            throw new IllegalArgumentException();
        }
        assert this.currentStatus == null; // trzeba to na wyjatek zamienic
        this.currentStatus = currentStatus;
    }

    public Product getProduct() { return product; }
    public void setProduct(Product product) {
        assert this.product == null; // trzeba to na wyjatek zamienic
        this.product = product;
    }

    public void changeStatus(Status newStatus) {
        this.currentStatus = newStatus;
    }

}
