/*
 * This file is generated by jOOQ.
 */
package ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.records;


import ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.AggregatorInfo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AggregatorInfoRecord extends UpdatableRecordImpl<AggregatorInfoRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1015493793;

    /**
     * Setter for <code>qiyanna.aggregator_info.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>qiyanna.aggregator_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>qiyanna.aggregator_info.count</code>.
     */
    public void setCount(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>qiyanna.aggregator_info.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AggregatorInfo.AGGREGATOR_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AggregatorInfo.AGGREGATOR_INFO.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AggregatorInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AggregatorInfoRecord value2(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AggregatorInfoRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AggregatorInfoRecord
     */
    public AggregatorInfoRecord() {
        super(AggregatorInfo.AGGREGATOR_INFO);
    }

    /**
     * Create a detached, initialised AggregatorInfoRecord
     */
    public AggregatorInfoRecord(Integer id, Integer count) {
        super(AggregatorInfo.AGGREGATOR_INFO);

        set(0, id);
        set(1, count);
    }
}
