package org.apache.commons.rdf;

/**
 * An <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-rdf-term" >RDF-1.1
 * Term</a>, as defined by <a href= "http://www.w3.org/TR/rdf11-concepts/"
 * >RDF-1.1 Concepts and Abstract Syntax</a>, a W3C Recommendation published on
 * 25 February 2014.<br>
 *
 * @see <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-rdf-term" >RDF-1.1
 * Term</a>
 */
public interface RDFTerm {

    /**
     * Return the term representation (TBD)
     *
     * @return term representation
     */
    String toString();

}
