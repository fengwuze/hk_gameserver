//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.19 at 11:20:40 AM CST 
//


package com.origingame.server.dao.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="db-list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="db" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="db" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="center-db">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="player-db-list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="player-db" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="shard-size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="round-step" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dbList",
    "centerDb",
    "playerDbList"
})
@XmlRootElement(name = "server-persistence")
public class ServerPersistence {

    @XmlElement(name = "db-list", required = true)
    protected DbList dbList;
    @XmlElement(name = "center-db", required = true)
    protected CenterDb centerDb;
    @XmlElement(name = "player-db-list", required = true)
    protected PlayerDbList playerDbList;

    /**
     * Gets the value of the dbList property.
     * 
     * @return
     *     possible object is
     *     {@link com.origingame.server.dao.jaxb.ServerPersistence.DbList }
     *     
     */
    public DbList getDbList() {
        return dbList;
    }

    /**
     * Sets the value of the dbList property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.origingame.server.dao.jaxb.ServerPersistence.DbList }
     *     
     */
    public void setDbList(DbList value) {
        this.dbList = value;
    }

    /**
     * Gets the value of the centerDb property.
     * 
     * @return
     *     possible object is
     *     {@link com.origingame.server.dao.jaxb.ServerPersistence.CenterDb }
     *     
     */
    public CenterDb getCenterDb() {
        return centerDb;
    }

    /**
     * Sets the value of the centerDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.origingame.server.dao.jaxb.ServerPersistence.CenterDb }
     *     
     */
    public void setCenterDb(CenterDb value) {
        this.centerDb = value;
    }

    /**
     * Gets the value of the playerDbList property.
     * 
     * @return
     *     possible object is
     *     {@link com.origingame.server.dao.jaxb.ServerPersistence.PlayerDbList }
     *     
     */
    public PlayerDbList getPlayerDbList() {
        return playerDbList;
    }

    /**
     * Sets the value of the playerDbList property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.origingame.server.dao.jaxb.ServerPersistence.PlayerDbList }
     *     
     */
    public void setPlayerDbList(PlayerDbList value) {
        this.playerDbList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CenterDb {

        @XmlAttribute(name = "ref")
        protected String ref;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="db" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ip" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="db" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "db"
    })
    public static class DbList {

        @XmlElement(required = true)
        protected List<Db> db;

        /**
         * Gets the value of the db property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the db property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.origingame.server.dao.jaxb.ServerPersistence.DbList.Db }
         * 
         * 
         */
        public List<Db> getDb() {
            if (db == null) {
                db = new ArrayList<Db>();
            }
            return this.db;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ip" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="db" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Db {

            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "ip")
            protected String ip;
            @XmlAttribute(name = "port")
            protected Integer port;
            @XmlAttribute(name = "db")
            protected Integer db;
            @XmlAttribute(name = "password")
            protected String password;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the ip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIp() {
                return ip;
            }

            /**
             * Sets the value of the ip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIp(String value) {
                this.ip = value;
            }

            /**
             * Gets the value of the port property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPort() {
                return port;
            }

            /**
             * Sets the value of the port property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPort(Integer value) {
                this.port = value;
            }

            /**
             * Gets the value of the db property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDb() {
                return db;
            }

            /**
             * Sets the value of the db property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDb(Integer value) {
                this.db = value;
            }

            /**
             * Gets the value of the password property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="player-db" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="shard-size" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="round-step" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "playerDb"
    })
    public static class PlayerDbList {

        @XmlElement(name = "player-db", required = true)
        protected List<PlayerDb> playerDb;
        @XmlAttribute(name = "shard-size")
        protected Integer shardSize;
        @XmlAttribute(name = "round-step")
        protected Integer roundStep;

        /**
         * Gets the value of the playerDb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the playerDb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlayerDb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.origingame.server.dao.jaxb.ServerPersistence.PlayerDbList.PlayerDb }
         * 
         * 
         */
        public List<PlayerDb> getPlayerDb() {
            if (playerDb == null) {
                playerDb = new ArrayList<PlayerDb>();
            }
            return this.playerDb;
        }

        /**
         * Gets the value of the shardSize property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShardSize() {
            return shardSize;
        }

        /**
         * Sets the value of the shardSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShardSize(Integer value) {
            this.shardSize = value;
        }

        /**
         * Gets the value of the roundStep property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRoundStep() {
            return roundStep;
        }

        /**
         * Sets the value of the roundStep property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRoundStep(Integer value) {
            this.roundStep = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PlayerDb {

            @XmlAttribute(name = "ref")
            protected String ref;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRef(String value) {
                this.ref = value;
            }

        }

    }

}
