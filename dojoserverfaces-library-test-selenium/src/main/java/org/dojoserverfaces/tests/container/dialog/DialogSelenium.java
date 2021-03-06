/*******************************************************************************
 * 	Copyright (c) 2011, The Dojo Foundation All Rights Reserved.
 * 	Available via Academic Free License >= 2.1 OR the modified BSD license.
 * 	see: http://dojotoolkit.org/license for details
 *******************************************************************************/
package org.dojoserverfaces.tests.container.dialog;

import org.dojoserverfaces.tests.selenium.SeleniumSetupSuite;
import org.dojoserverfaces.tests.selenium.dojoserverfaces.LayoutComponentSelenium;
import junit.framework.Test;
import junit.framework.TestSuite;

public class DialogSelenium extends LayoutComponentSelenium {

    public DialogSelenium() {
        this.widgetValues = new DialogValues();
        this.widgetInteraction = new DialogInteraction(widgetValues);
    }

    private static SeleniumSetupSuite seleniumSetupSuite;

    public static Test suite() {
        seleniumSetupSuite = new SeleniumSetupSuite(new TestSuite(
                DialogSelenium.class));
        return seleniumSetupSuite;
    }

    public void setUp() throws Exception {
        selenium = seleniumSetupSuite.getSelenium();
        if (selenium != null) {
            this.widgetInteraction.setSelenium(selenium);
            selenium
                    .open("http://localhost:8080/eclipse-dojoserverfaces-library-test-selenium/dojoserverfaces/container/dialog/index.jsf");
        }
    }

    public void testSelfProperties() throws Exception {
        waitForDojoReady();
        verifyEquals(
                "The attribute 'tooltip' could was not set as expected",
                "This is DojoServerFaces Dialog.",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('tooltip')"));
        System.out
                .println("Tooltip is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('tooltip')"));
        verifyEquals(
                "The attribute 'duration' could was not set as expected",
                "80",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('duration')"));
        System.out
                .println("Duration is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('duration')"));
        verifyEquals(
                "The attribute 'refocus' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('refocus')"));
        System.out
                .println("Refocus is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('refocus')"));
        verifyEquals(
                "The attribute 'autofocus' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('autofocus')"));
        System.out
                .println("Autofocus is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('autofocus')"));
        verifyEquals(
                "The attribute 'draggable' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('draggable')"));
        System.out
                .println("Draggable is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('draggable')"));
        verifyEquals(
                "The attribute 'errorMessage' could was not set as expected",
                "Dialog couldn't be loaded.",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('errorMessage')"));
        System.out
                .println("ErrorMessage is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('errorMessage')"));
        verifyEquals(
                "The attribute 'loadingMessage' could was not set as expected",
                "Dialog is Loading.",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('loadingMessage')"));
        System.out
                .println("LoadingMessage is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('loadingMessage')"));
        verifyEquals(
                "The attribute 'extractContent' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('extractContent')"));
        System.out
                .println("ExtractContent is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('extractContent')"));
        verifyEquals(
                "The attribute 'preLoad' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('preLoad')"));
        System.out
                .println("PreLoad is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('preLoad')"));
        verifyEquals(
                "The attribute 'preventCache' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('preventCache')"));
        System.out
                .println("PreventCache is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('preventCache')"));
        verifyEquals(
                "The attribute 'refreshOnShow' could was not set as expected",
                "true",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('refreshOnShow')"));
        System.out
                .println("RefreshOnShow is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('refreshOnShow')"));
    }

    public void testInheritedLayoutComponentsProperties() {
        waitForDojoReady();
        verifyEquals(
                "The attribute 'style' could was not set as expected",
                "width: 350px; height: 200px;",
                selenium
                        .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('style')"));
        System.out
                .println("Style is----->>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:initialValues:widgetSimple').get('style')"));
    }

    public void testAjaxRefresh() throws Exception {
        waitForDojoReady();
        String titleBeforeClick = selenium
                .getEval("window.dijit.byId('form:ajaxRefresh:widgetAjaxCall').get('title')");
        System.out
                .println("Title Before Click-------->>>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:ajaxRefresh:widgetAjaxCall').get('title')"));
        selenium.click("form:ajaxRefresh:button");
        System.out.println("*********Button Got Clicked**********");
        String titleAfterClick = selenium
                .getEval("window.dijit.byId('form:ajaxRefresh:widgetAjaxCall').get('title')");
        System.out
                .println("Title After Click-------->>>>>"
                        + selenium
                                .getEval("window.dijit.byId('form:ajaxRefresh:widgetAjaxCall').get('title')"));
        if ((!(titleBeforeClick.equals(titleAfterClick))))
            System.out.println("******Testcase Passed.******");
        else
            System.out.println("******Testcase Failed.******");
    }
}