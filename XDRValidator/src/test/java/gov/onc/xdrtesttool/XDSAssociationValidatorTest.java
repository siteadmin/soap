package gov.onc.xdrtesttool;

import static org.junit.Assert.assertEquals;
import gov.onc.xdrtesttool.error.XDRMessageRecorder;
import gov.onc.xdrtesttool.validate.XDSAssociationValidator;

import java.util.List;

import org.junit.Test;
import org.springframework.ws.soap.SoapMessage;

public class XDSAssociationValidatorTest extends XDRBaseTest {
	@Test
	public void validate() {
		SoapMessage message = getSoapMessage();
		XDSAssociationValidator validator = new XDSAssociationValidator();
		XDRMessageRecorder errorRecorder = new XDRMessageRecorder();
		validator.validate(message, errorRecorder, null);
		List errors = errorRecorder.getMessageErrors();
		assertEquals(errors.size(), 0);
		List warnings = errorRecorder.getMessageWarnings();
		assertEquals(warnings.size(), 0);
		List infos = errorRecorder.getMessageInfos();
		assertEquals(infos.size(), 0);
	}

}
