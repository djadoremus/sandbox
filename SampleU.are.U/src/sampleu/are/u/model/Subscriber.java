package sampleu.are.u.model;

import com.digitalpersona.uareu.Fmd;
import com.digitalpersona.uareu.dpfj.FmdImpl;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author djadoremus
 */
@Entity
@Table
public class Subscriber implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;
    private String name;
    private String remarks;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "fmd")
    @Lob
    private byte[] fmd;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the fmd
     */
    public byte[] getFmd() {
        return fmd;
    }

    /**
     * @param fmd the fmd to set
     */
    public void setFmd(byte[] fmd) {
        this.fmd = fmd;
    }
    
    
}
