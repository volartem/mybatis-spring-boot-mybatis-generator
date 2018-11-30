package news.project.demo.models;

import java.io.Serializable;

public class Category implements Serializable {
    private int id;

    private String name;

    private Integer outerId;

    private Integer parentOuterId;

    private static final long serialVersionUID = 1L;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOuterId() {
        return outerId;
    }

    public void setOuterId(Integer outerId) {
        this.outerId = outerId;
    }

    public Integer getParentOuterId() {
        return parentOuterId;
    }

    public void setParentOuterId(Integer parentOuterId) {
        this.parentOuterId = parentOuterId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Category other = (Category) that;
        return (this.getId() == other.getId())
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOuterId() == null ? other.getOuterId() == null : this.getOuterId().equals(other.getOuterId()))
            && (this.getParentOuterId() == null ? other.getParentOuterId() == null : this.getParentOuterId().equals(other.getParentOuterId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getId();
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOuterId() == null) ? 0 : getOuterId().hashCode());
        result = prime * result + ((getParentOuterId() == null) ? 0 : getParentOuterId().hashCode());
        return result;
    }
}