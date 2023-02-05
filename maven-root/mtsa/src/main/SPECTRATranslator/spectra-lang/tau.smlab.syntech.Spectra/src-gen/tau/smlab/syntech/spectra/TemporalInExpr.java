/**
 * generated by Xtext 2.25.0
 */
package tau.smlab.syntech.spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal In Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.smlab.syntech.spectra.TemporalInExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link tau.smlab.syntech.spectra.TemporalInExpr#isNot <em>Not</em>}</li>
 *   <li>{@link tau.smlab.syntech.spectra.TemporalInExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link tau.smlab.syntech.spectra.TemporalInExpr#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see tau.smlab.syntech.spectra.SpectraPackage#getTemporalInExpr()
 * @model
 * @generated
 */
public interface TemporalInExpr extends TemporalExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(TemporalExpression)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getTemporalInExpr_Left()
   * @model containment="true"
   * @generated
   */
  TemporalExpression getLeft();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.TemporalInExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TemporalExpression value);

  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(boolean)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getTemporalInExpr_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.TemporalInExpr#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getTemporalInExpr_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.TemporalInExpr#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link tau.smlab.syntech.spectra.ValueInRange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see tau.smlab.syntech.spectra.SpectraPackage#getTemporalInExpr_Values()
   * @model containment="true"
   * @generated
   */
  EList<ValueInRange> getValues();

} // TemporalInExpr