#!/usr/bin/env groovy

@Grapes([
  @GrabResolver(name='mvnRepository', root='http://central.maven.org/maven2/'),
  @GrabResolver(name='kint', root='http://nexus.k-int.com/content/repositories/releases'),
  @Grab(group='org.slf4j', module='slf4j-api', version='1.7.25'),
  @Grab(group='net.sf.opencsv', module='opencsv', version='2.3'),
  @Grab(group='org.apache.httpcomponents', module='httpmime', version='4.1.2'),
  @Grab(group='org.apache.httpcomponents', module='httpclient', version='4.5.3'),
  @Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1'),
  @Grab(group='org.apache.httpcomponents', module='httpmime', version='4.1.2'),
  @Grab(group='org.slf4j', module='slf4j-api', version='1.7.6'),
  @Grab(group='org.slf4j', module='jcl-over-slf4j', version='1.7.6'),
  @Grab(group='net.sourceforge.nekohtml', module='nekohtml', version='1.9.22'),
  @Grab(group='xerces', module='xercesImpl', version='2.11.0')
])

import groovyx.net.http.*
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import groovyx.net.http.*
import org.apache.http.entity.mime.*
import org.apache.http.entity.mime.content.*
import org.apache.http.*
import org.apache.http.protocol.*
import java.nio.charset.Charset
import static groovy.json.JsonOutput.*
import groovy.util.slurpersupport.GPathResult
import org.apache.log4j.*
import java.text.SimpleDateFormat
import au.com.bytecode.opencsv.CSVReader
import au.com.bytecode.opencsv.CSVWriter
import groovyx.net.http.*
import static groovyx.net.http.ContentType.XML
import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.Method.GET
import static groovyx.net.http.Method.POST
import java.util.Properties
import java.text.*
import org.olf.ncip.client.*

def cli = new CliBuilder(usage: 'groovy -cp ./path/to/ncip-tools.jar ./CLI.groovy -h -u user -p pass -t NCIPTargetUrl')
// Create the list of options.
cli.with {
  h longOpt: 'help', 'Show usage information'
  u longOpt: 'user', args: 1, argName: 'username', 'username', required:true
  p longOpt: 'pass', args: 1, argName: 'password', 'password', required:false
  t longOpt: 'target', args: 1, argName: 'target', 'target', required:true
}

def options = cli.parse(args)
if (!options) {
  println("No options");
  return
}
else {
  println(options)
}

// Show usage text when -h or --help option is used.
if (options.h) {
  cli.usage()
  return
}

NcipClient ncip_client = new Ncip202Client(options.t);

Map lookup_client_response = ncip_client.lookupUser()

println("Lookup client response: ${lookup_client_response}");
