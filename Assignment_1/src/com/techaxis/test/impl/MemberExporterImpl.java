package com.techaxis.test.impl;

import java.io.IOException;
import java.io.Writer;

import com.techaxis.java.test.Member;
import com.techaxis.java.test.MemberExporter;

public class MemberExporterImpl implements MemberExporter {

	@Override
	public void writeMember( Member member, Writer writer ) throws IOException {
		writer.write( member.toCSVString( ) );
	}

}
