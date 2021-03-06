/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature To Plugin Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureToPluginDependencyImpl#getMatchRule <em>Match Rule</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureToPluginDependencyImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureToPluginDependencyImpl extends VersionnedElementImpl implements FeatureToPluginDependency {

	/**
	 * The default value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected static final MatchRule MATCH_RULE_EDEFAULT = MatchRule.NONE;

	/**
	 * The cached value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected MatchRule matchRule = MATCH_RULE_EDEFAULT;




	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Plugin target;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureToPluginDependencyImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.FEATURE_TO_PLUGIN_DEPENDENCY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MatchRule getMatchRule() {

		return matchRule;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMatchRule(MatchRule newMatchRule) {

		MatchRule oldMatchRule = matchRule;
		matchRule = newMatchRule == null ? MATCH_RULE_EDEFAULT : newMatchRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE, oldMatchRule, matchRule));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Plugin getTarget() {

		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Plugin)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET, oldTarget, target));
			}
		}
		return target;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Plugin basicGetTarget() {

		return target;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTarget(Plugin newTarget) {

		Plugin oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET, oldTarget, target));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE:
				return getMatchRule();
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE:
				setMatchRule((MatchRule)newValue);
				return;
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET:
				setTarget((Plugin)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE:
				setMatchRule(MATCH_RULE_EDEFAULT);
				return;
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET:
				setTarget((Plugin)null);
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE:
				return matchRule != MATCH_RULE_EDEFAULT;
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (matchRule: ");
		result.append(matchRule);
		result.append(')');
		return result.toString();
	}


} //FeatureToPluginDependencyImpl
