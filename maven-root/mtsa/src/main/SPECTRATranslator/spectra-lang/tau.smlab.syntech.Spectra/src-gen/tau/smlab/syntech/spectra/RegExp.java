/**
 * generated by Xtext 2.25.0
 */
package tau.smlab.syntech.spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.smlab.syntech.spectra.RegExp#getVal <em>Val</em>}</li>
 *   <li>{@link tau.smlab.syntech.spectra.RegExp#getAssrt <em>Assrt</em>}</li>
 *   <li>{@link tau.smlab.syntech.spectra.RegExp#isEmpty <em>Empty</em>}</li>
 *   <li>{@link tau.smlab.syntech.spectra.RegExp#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see tau.smlab.syntech.spectra.SpectraPackage#getRegExp()
 * @model
 * @generated
 */
public interface RegExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getRegExp_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.RegExp#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Assrt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assrt</em>' containment reference.
   * @see #setAssrt(BooleanTerm)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getRegExp_Assrt()
   * @model containment="true"
   * @generated
   */
  BooleanTerm getAssrt();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.RegExp#getAssrt <em>Assrt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assrt</em>' containment reference.
   * @see #getAssrt()
   * @generated
   */
  void setAssrt(BooleanTerm value);

  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(boolean)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getRegExp_Empty()
   * @model
   * @generated
   */
  boolean isEmpty();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.RegExp#isEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #isEmpty()
   * @generated
   */
  void setEmpty(boolean value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(RegExp)
   * @see tau.smlab.syntech.spectra.SpectraPackage#getRegExp_Left()
   * @model containment="true"
   * @generated
   */
  RegExp getLeft();

  /**
   * Sets the value of the '{@link tau.smlab.syntech.spectra.RegExp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(RegExp value);

} // RegExp
