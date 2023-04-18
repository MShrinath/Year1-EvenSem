package VotingSystem;

import javax.swing.*;
import java.util.List;

public class VoterDisplay extends JFrame {
    private JTabbedPane tabbedPane;

    VoterDisplay(List<VoterInfo> voterInfoList) {
        tabbedPane = new JTabbedPane();
        addTabs(voterInfoList);
        setTitle("Voter Information");
        setSize(500, 500);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void addTabs(List<VoterInfo> voterInfoList) {
        for (VoterInfo voterInfo : voterInfoList) {
            JPanel panel = new JPanel();
            panel.add(new JLabel("Name: " + voterInfo.getName()));
            panel.add(new JLabel("Voter ID: " + voterInfo.getVoterId()));
            panel.add(new JLabel("Age: " + voterInfo.getAge()));
            panel.add(new JLabel("City: " + voterInfo.getCity()));
            panel.add(new JLabel("Gender: " + voterInfo.getGender()));
            panel.add(new JLabel("Voted for: " + voterInfo.getPartySymbol()));
            tabbedPane.addTab(voterInfo.getName(), panel);
        }
        JPanel panel = new JPanel();
        panel.add(new JLabel("Total Votes: " + voterInfoList.size()));
        tabbedPane.addTab("Results", panel);
        add(tabbedPane);
    }
}
